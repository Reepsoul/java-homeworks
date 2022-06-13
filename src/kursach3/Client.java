package kursach3;

import java.io.IOException;
import java.net.Socket;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Client implements Runnable {

    private int port;
    private String ip;
    private Scanner scanner;
    private SimpleMessage simpleMessage; //+

    public Client(int port, String ip) {
        this.port = port;
        this.ip = ip;
        scanner = new Scanner(System.in);
    }


    public void start() throws Exception {
        System.out.println("¬ведите им€");
        String name = scanner.nextLine();
        Connection connection = new Connection(getSocket());
        
        Thread sender = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    String messageText = scanner.nextLine();
                    if (messageText.equalsIgnoreCase("exit")) {
                        connection.close();
                        Thread.currentThread().interrupt();
                        break;
                    }
                    connection.sendMessage(SimpleMessage.getMessage(name, messageText));
                    System.out.println(" ");
                }
            } catch (Exception e) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                e.printStackTrace();
            }
        });
        
        Thread getter = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    SimpleMessage fromServer = connection.readMessage();
                    System.out.println(fromServer);
                }
            } catch (IOException | ClassNotFoundException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        });
        sender.start();
        getter.start();
    }

    private void sendAndPrintMessage(SimpleMessage message) throws Exception {
        try (Connection connection = new Connection(getSocket())){ // getSocket “олько дл€ того, чтобы посмотреть методы сокета

            LocalDateTime time = null;
            if (message.getText().equalsIgnoreCase("ping")) {
                time = LocalDateTime.now();
            }
            connection.sendMessage(message);

            SimpleMessage formServer = connection.readMessage();
            if (formServer.getText().equalsIgnoreCase("ping")) {
                String str = "ping: " + Duration.between(time, LocalDateTime.now()).getNano();
            }


            System.out.println("ответ от сервера: " + formServer);
        }
    }

    private Socket getSocket() throws IOException {
        Socket socket = new Socket(ip, port);
        return socket;
    }

    @Override
    public void run() {
    	System.out.println(Thread.currentThread().getName());
    }
    


	public static void main(String[] args) {
        int port = 8090;
        String ip = "127.0.0.1";
		
        try {
            new Client(8090, "127.0.0.1").start();
        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
}