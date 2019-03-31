package linkedlist;

public class LinkedList {
	Node head = null;
	Node current = null;
	Node old = null;

	void add(int data) {

		Node n = new Node();
		n.data = data;

		if (head == null) {
			head = n;
			current = n;

		} else {
			current.nextNodeReference = n;
			old = current;
			current = n;
		}
	}

	void removeEle(int ele) {
		Node n = head;
		Node t = head;
		while (n != null) {
			if (head.data == ele) {
				head = head.nextNodeReference;
				break;
			}
			if (n.data == ele) {
				t.nextNodeReference = n.nextNodeReference;
				break;
			}
			t = n;
			n = n.nextNodeReference;
		}

	}

	void removeAt(int p) {
		Node n = head;
		Node t = head;
		int pos = 1;
		while (n != null) {
			if (p == 1) {
				head = head.nextNodeReference;
				break;
			}
			if (pos == p) {
				t.nextNodeReference = n.nextNodeReference;
			}
			t = n;
			n = n.nextNodeReference;
			pos++;
		}

	}

	void display() {
		Node n = head;
		System.out.println("Elements are; ");
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNodeReference;
		}
	}

	int size() {
		Node n = head;
		int s = 0;
		while (n != null) {
			s++;
			n = n.nextNodeReference;
		}
		return s;
	}
	
	int max() {
		Node n=head;
		int mx=head.data;
		while(n!=null) {
			if(n.data>mx) {
				mx=n.data;
			}
			n=n.nextNodeReference;
		}
		return mx;
	}
	
	int min() {
		Node n=head;
		int mn=head.data;
		while(n!=null) {
			if(n.data<mn) {
				mn=n.data;
			}
			n=n.nextNodeReference;
		}
		return mn;
	}
	
	/*int secondmin() {
		Node n=head;
		int mn=head.data;
		int mn2=head.data;
		while(n!=null) {
			if(n.data<mn) {
				mn=n.data;
				mn2=mn;
			}
			n=n.nextNodeReference;
		}
		return mn;
	}*/ 
}


