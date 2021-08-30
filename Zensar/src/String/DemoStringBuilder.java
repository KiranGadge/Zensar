package String;

public class DemoStringBuilder {

	public static void main(String[] args) {
		
	
	String s1="Welcome";
	String s2=new String("Welcome");
	
	StringBuffer sb=new StringBuffer("java");
	StringBuffer sb2=new StringBuffer("java");
	
	String s3=sb.toString();
	sb.append(" is OOPs language");
	sb.append("Sun microsystems");
		
	System.out.println(sb);

	
	sb.insert(1,"kiran");
	System.out.println(sb);
	sb.delete(1,30);
	System.out.println(sb);
	sb.setCharAt(1,'a');
	System.out.println(sb);
	sb.deleteCharAt(0);
	System.out.println(sb);
	

	StringBuilder sbb=new StringBuilder();
	sbb.append("hello");
	sbb.reverse();
}

}
