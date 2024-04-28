package list;

public class SinglyLinkedList {
	private Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insertAtBeg(int v) {

		Node nn = new Node(v);// here new node will be created with data and null value
		if (nn == null)
			return false;
//		if(head==null)
//			head=nn;
//		else {
//			nn.setNext(head);
//			head=nn;
//		}

		if (head != null)
			nn.setNext(head);
		head = nn;
		return true;

	}

	public boolean insertAtLast(int v) {
		return false;

	}

	public boolean deleteAtBeg() {

		return false;

	}

	public boolean deleteAtLast() {
		if (head == null)
			return false;

		Node temp = head;

		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		return true;

	}

	public void display() {
		Node temp = head;
		System.out.println("\nList Elements  -");
		while (temp != null) {
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
		}

	}

	public void search(int v) {
		// temp points to first node
		Node temp = head;
		int c = 0;
		while (temp != null) {
			// c is position every time it will increase if data not found
			c++;
			// if will run when ata found
			if (v == temp.getData()) {
				// print msg found with position
				System.out.println("\n " + v + "found at position " + c);
				break;
			}
			// temp go ahead till it becomes null
			temp = temp.getNext();
		}
	}

	public void reverse() {
		Node p, q, r;
		p = head;
		q = p.getNext();
		while (q != null) {
			r = q.getNext();
			q.setNext(p);
			p = q;
			q = r;
		}
		head.setNext(null);
		head = p;
	}

	public boolean insertAtPos(int v, int p) {
		// for empty list
		if (head == null)
			return false;
		// for negative position
		if (p <= 0) {
			System.out.println("please enter positive value as position");
			return false;
		}
		// if position is first
		if (p == 1)
			insertAtBeg(v);
		else {
			Node temp = head;
			Node nn = new Node(v);
			int i = 1;
			while (i < p - 1 && temp != null) {
				temp = temp.getNext();
				i++;
			}
			// invalid position
			if (temp == null) {
				System.out.println("Invalid Position");
				return false;
			}
			// insertion of node at it's valid position
			nn.setNext(temp.getNext());
			temp.setNext(nn);
		}
		return true;
	}

	public boolean deleteAtPos(int p) {
		// for empty list
		if (head == null)
			return false;
		// for negative position
		if (p <= 0) {
			System.out.println("\nplease enter positive value as position");
			return false;
		}
		// if position is first
		if (p == 1)
			deleteAtBeg();
		else {
			Node temp = head;
			int i = 1;
			while (i < p - 1 && temp != null) {
				temp = temp.getNext();
				i++;
			}
			// invalid position
			if (temp == null) {
				System.out.println("\nInvalid Position");
				return false;
			}
			Node t = temp.getNext();
			temp.setNext(t.getNext());
			t.setNext(null);
			System.out.println("\nNode deleted -" + t.getData());
		}
		return true;
	}

}
