package Comparator;

public class Theater {

	private int id;
	private String tname;
	private String location;
	private Movie movie;
	
	Theater()
	{
		
	}

	public Theater(int id, String tname, String location, Movie movie) {
		super();
		this.id = id;
		this.tname = tname;
		this.location = location;
		this.movie = movie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theater has--> id=" + id + ", tname=" + tname + ", location=" + location ;
	}
	
	
	
}
