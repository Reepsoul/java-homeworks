package kursach4;

import lombok.ToString;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;



@Getter
@Setter

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
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdress (String adress) {
		if (adress == null || adress.length() < 5) {
			throw new IllegalArgumentException("Значение adress должно быть от 5 символов");
		}
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}
	
	@ToString
	public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
	
	}	
}