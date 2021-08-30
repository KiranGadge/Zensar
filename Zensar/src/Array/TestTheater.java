package Array;

import java.util.Scanner;

public class TestTheater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Theater [] theater = new Theater[3];
		for(int i=0;i<theater.length;i++)
		{
			theater [i] = new Theater();
		
		System.out.println("Enter Theater id,name,location:- ");
		theater[i].setTheaterid(sc.nextInt());
		theater[i].setTheatername(sc.next());
		theater[i].setLocation(sc.next());
		
		Movie [] movie = new Movie[3];
		for(int j=0;j<theater.length;j++)
		{
			movie[j] = new Movie();
			System.out.println("Enter movie id ,name,ratings:- ");
			movie[j].setMovieid(sc.nextInt());
			movie[j].setMoviename(sc.next());
			movie[j].setRating(sc.nextInt());
		}
		theater[i].setMovie(movie);
		}
		
		for(int i=0;i<theater.length;i++)
		{
		//	for(int j=i+1;j<movie.length;j++)
			{
			//	if(theater[j].getMovie().getRating()>theater[j+1].getMovie().getRating())
			}
		}
	}

}
