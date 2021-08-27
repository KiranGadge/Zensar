package Containment;

public class Pen {

	private String brand;
	private int caplength;
	private Refill r;
	
	Pen()
	{
		
	}

	public Pen(String brand, int caplength, Refill r) {
		super();
		this.brand = brand;
		this.caplength = caplength;
		this.r = r;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCaplength() {
		return caplength;
	}

	public void setCaplength(int caplength) {
		this.caplength = caplength;
	}

	public Refill getR() {
		return r;
	}

	public void setR(Refill r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Pen has brand=" + brand + ", caplength=" + caplength + "\n" + r ;
	}
	
	
}
