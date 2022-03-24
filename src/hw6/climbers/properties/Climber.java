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
			throw new IllegalArgumentException("�������� name ������ ���� �� 3 ��������");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setAdress (String adress) {
		if (adress == null || adress.length() < 5) {
			throw new IllegalArgumentException("�������� adress ������ ���� �� 5 ��������");
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
