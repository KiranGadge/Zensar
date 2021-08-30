package Array;

import java.util.Arrays;

public class Theater {

	private int Theaterid;
	private String Theatername;
	private String location;
	private Movie[] movie;
	
	Theater()
	{
		
	}

	public Theater(int theaterid, String theatername, String location, Movie[] movie) {
		super();
		Theaterid = theaterid;
		Theatername = theatername;
		this.location = location;
		this.movie = movie;
	}

	public int getTheaterid() {
		return Theaterid;
	}

	public void setTheaterid(int theaterid) {
		Theaterid = theaterid;
	}

	public String getTheatername() {
		return Theatername;
	}

	public void setTheatername(String theatername) {
		Theatername = theatername;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie[] getMovie() {
		return movie;
	}

	public void setMovie(Movie[] movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theater has Theaterid=" + Theaterid + ", Theatername=" + Theatername + ", location=" + location
				+ ", movie=" + Arrays.toString(movie) + "]";
	}
	
}
