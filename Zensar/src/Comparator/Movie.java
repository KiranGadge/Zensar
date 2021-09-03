package Comparator;

public class Movie {

	private int movieid;
	private String moviename;
	private int rating;
	
	
	Movie()
	{
		
	}
	
	public Movie(int movieid,String moviename,int rating)
	{
		this.movieid=movieid;
		this.moviename=moviename;
		this.rating=rating;
	}
	
	public void setMovieid(int movieid)
	{
		this.movieid=movieid;
	}
	public int getMovieid()
	{
		return movieid;
	}
	public void setMoviename(String moviename)
	{
		this.moviename=moviename;
	}
	public String getMoviename()
	{
		return moviename=moviename;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	public int getRating()
	{
		return rating=rating;
	}
	
	public String toString()
	{
		return "Movie has-> Movieid:- "+movieid+" Moviename:- "+moviename+" Rating:- "+rating;
	}
}
