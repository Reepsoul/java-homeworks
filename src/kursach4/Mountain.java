package kursach4;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Mountain {

	public String name;
	public String country;
	public int height;
	
	public Mountain(String name, String country, int height){
		setName(name);
		setCountry(country);
		setHeight(height);
		
	}
	
	//name
	public void setName (String name) {
		if (name == null || name.length() < 4) {
			throw new IllegalArgumentException("Значение name должно быть от 4 символов");
		}
	}
	
	public String getName() {
		return name;
	}
	
	//country
	public void setCountry (String country) {
		if (country == null || country.length() < 4) {
			throw new IllegalArgumentException("Значение country должно быть от 4 символов");
		}
	}
	
	public String getCountry() {
		return country;
	}
	
	//height
	public void setHeight (int height) {
		if (height == 0 || height < 100) {
			throw new IllegalArgumentException("Значение height должно быть от 100 метров");
		}
	}
	
	public int getHeight() {
		return height;
	}
}