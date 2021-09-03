package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test_Theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Theater> tlist =new ArrayList<>();
		tlist.add(new Theater(1,"Krushna","karveroad",new Movie(1,"URI",9)));
		tlist.add(new Theater(2,"Dipak","Shivne",new Movie(2,"Bhuj",9)));
		tlist.add(new Theater(3,"Apollo","karveroad",new Movie(3,"Gazi",7)));
		tlist.add(new Theater(4,"INox","karveroad",new Movie(4,"Shershah",8)));
		
		Comparator<Theater> tr =new Comparator<Theater>() 
		{
			
			public int compare(Theater t1, Theater t2) {
				if(t1.getMovie().getRating()!=t2.getMovie().getRating())
				return t1.getMovie().getRating()-t2.getMovie().getRating() ;
				else
					return t1.getTname().compareTo(t2.getTname());
			}
		};
		
		Collections.sort(tlist,tr);;
		tlist.forEach(t->System.out.println(t));

		}
	

	

	

}
