package kursach2;

import java.util.Scanner;

public abstract class Menu {
    abstract void execute();

    public static Menu getFirstCommand() {
        System.out.println("����: \n1. ������ ���� \n2. ��������� ���� \n3. �����");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return new StartGame(new Text ().getText()[0]);
        } else if (i == 2) {
            return new StartGame(new Text ().getText()[0]);
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("������� ������� �����������, ���������� ��� ���!");
        return Menu.getFirstCommand();
    }

    static Menu getSecondCommand(Game gameObject) {
        System.out.println("����: \n1. ��������� ���� \n2. ��������� ���� \n3. �����");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return  new SaveGame(gameObject);
        } else if (i == 2) {
            return new StartGame(gameObject);
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("������� ������� �����������, ���������� ��� ���!");
        return Menu.getSecondCommand(gameObject);
    }
}