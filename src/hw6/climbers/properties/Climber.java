package hw6.climbers.properties;

public class Climber {

	public String name;
	public String adress;
	
	public Climber(String name, String adress) {
		setName(name);
		setAdress(adress);
	}
	
	public void setName (String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("Значение name должно быть от 3 символов");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdress (String adress) {
		if (adress == null || adress.length() < 5) {
			throw new IllegalArgumentException("Значение adress должно быть от 5 символов");
		}
	}
	
	public String getAdress() {
		return adress;
	}
	
	public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
	
	}	
}
