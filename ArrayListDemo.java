import java.util.*;
class ArrayListDemo{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		//ArrayList al =new ArrayList();
		System.out.println(al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		//al.add(10);
		System.out.println(al.size());
		al.remove(2);
		System.out.println("After removing 2nd index size is: "+al.size());
		System.out.println(al);
	}
}