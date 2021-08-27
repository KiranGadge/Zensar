package Containment;

public class Nib {

	private String material;
	private int width;
	
	Nib()
	{
		
	}

	public Nib(String material, int width) {
		super();
		this.material = material;
		this.width = width;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Nib has material=" + material + ", width=" + width ;
	}
	
}
