import java.util.*;
class ArrayListDemo1{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
	//	ArrayList al=new ArrayList();
		int x[]={1,-1,2,-2,3,-3,4,-4};

		for (int i=0;i<x.length ;i++ )
			al.add(x[i]);
		System.out.println(al);

		Iterator<Integer> i=al.iterator();
	//	Iterable i=al.iterator	();
		while(i.hasNext()){
			Integer z=i.next();
			//integer z=(integer)i.next();
			if(z.intValue()<0)		//Downcast
				i.remove();
		}
		System.out.println(al);
	}
}