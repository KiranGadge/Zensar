package Array;

public class Movie {

	private int Movieid;
	private String moviename;
	private int Rating;
	
	Movie()
	{
		
	}
	
	public Movie(int movieid,String moviename,int rating)
	{
		this.Movieid = movieid;
		this.moviename = moviename;
		Rating = rating;
	}
	
	public void setMovieid(int movieid)
	{
		this.Movieid = movieid;
	}
	public int getMovieid()
	{
		return Movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}
	
}
