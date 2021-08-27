package Containment;

public class Movie {
	
private int movieid;
private String moviename;
private Actor actor;

Movie()
{
	
}
public Movie(int movieid, String moviename, Actor actor) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.actor = actor;
}
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public Actor getActor() {
	return actor;
}
public void setActor(Actor actor) {
	this.actor = actor;
}

}
