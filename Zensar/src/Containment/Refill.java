package Containment;

public class Refill {
	private String inkcolor;
	private int length;
	private Nib nib;
	
	Refill()
	{
		
	}

	public Refill(String inkcolor, int length, Nib nib) {
		super();
		this.inkcolor = inkcolor;
		this.length = length;
		this.nib = nib;
	}

	public String getInkcolor() {
		return inkcolor;
	}

	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	public void setNib(Nib nib) {
		this.nib = nib;
	}

	@Override
	public String toString() {
		return "Refill has inkcolor=" + inkcolor + ", length=" + length + "\n"+nib;
	}

	
}
