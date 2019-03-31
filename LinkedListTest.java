package linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(12);
		l.add(113);
		l.add(2);
		l.add(1);System.out.println("Size is:"+l.size());
		
		System.out.println("max ele is:"+l.max());
		System.out.println("min ele is:"+l.min());
		l.display();
		l.removeAt(3);
		l.display();
		l.removeAt(1);
		l.display();
		l.removeAt(1);
		l.display();
		l.removeEle(15);
		l.display();
		l.removeEle(10);
		l.display();
		l.removeEle(13);
		l.display();
		
		
	}


}


