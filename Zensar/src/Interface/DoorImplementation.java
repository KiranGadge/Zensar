package Interface;

public class DoorImplementation implements Door {

	

	@Override
	public void open() {
		System.out.println("Door is open");
		
	}

	@Override
	public void close() {
		System.out.println("Door is closed");
		
	}

	@Override
	public void locked() {
		System.out.println("Door is locked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoorImplementation d = new DoorImplementation();
		d.open();
		d.close();
		d.locked();
	}

}
