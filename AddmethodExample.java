import java.util.*;
public class AddMethodExample{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Hello");
		al.add("String");
		al.add("test");
		al.add(3,"I am at 3");
		System.out.println(al);
		al.add(0,"Bye");
		System.out.println("Element after adding string Bye: "+al);
	}
}