package sclist;

public class SinglyCircularLinkedList {
	private SCNode head, tail;

	public SinglyCircularLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public SCNode getHead() {
		return head;
	}

	public void setHead(SCNode head) {
		this.head = head;
	}

	public SCNode getTail() {
		return tail;
	}

	public void setTail(SCNode tail) {
		this.tail = tail;
	}

	public boolean insertAtBeg(int v) {

		SCNode nn = new SCNode(v);// here new SCNode will be created with data and null value
		if (nn == null)
			return false;
		if (head == null) {
			head = tail = nn;
			head.setNext(head);
			
		} else {
			nn.setNext(head);
			head = nn;
			tail.setNext(head);
		}
		return true;
	}

	public boolean insertAtLast(int v) {
		
		SCNode nn = new SCNode(v);// here new SCNode will be created with data and null value
		if (nn == null)
			return false;
		if (head == null) {
			head = tail = nn;
			head.setNext(head);
		}
		else
		{
			tail.setNext(nn);
			nn.setNext(head);
			tail=nn;
		}
		return true;

	}

	public boolean deleteAtBeg() {
		if (head == null) 
			return false;
		head=head.getNext();
		tail.getNext().setNext(null);
		tail.setNext(head);
		return true;
	}

	public boolean deleteAtLast() {
		if (head == null)
			return false;

		SCNode temp = head;

		while (temp.getNext().getNext() != head) {
			temp = temp.getNext();
		}
		temp.setNext(head);
		tail=temp;
		return true;

	}
	public void checkCircularity(int n) {
		SCNode temp=head;
		int i=1;
		while(i<=n)
		{
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
			i++;
		}
		
	}

	public void display() {
		SCNode temp = head;
		System.out.println("\nList Elements  -");
		while (temp.getNext() != head) {
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
		}
		System.out.print("\t" + temp.getData()+"\n");
	}

	public void search(int v) {
		// temp points to first SCNode
		boolean flag=false;
		SCNode temp = head;
		int c = 0;
		while (temp.getNext() !=head ) {
			// c is position every time it will increase if data not found
			c++;
			// if will run when ata found
			if (v == temp.getData()) {
				// print msg found with position
				flag =true;
				break;
			}
			// temp go ahead till it becomes null
			temp = temp.getNext();
		}
		if(flag==true) {
			System.out.println("\n " + v + " found at position " + c);
		}else if (v == temp.getData()) {
			c++;
			// print msg found with position
			System.out.println("\n " + v + " found at position " + c);
			}
		else {
			System.out.println("\n " + v + " Not found ");
	}
		
	}

	public void reverse() {
		SCNode p, q, r;
		p = head;
		q = p.getNext();
		while (q != head) {
			r = q.getNext();
			q.setNext(p);
			p = q;
			q = r;
		}

		// head=p;
		q.setNext(p);
		tail = q;

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
			SCNode temp = head;
			SCNode nn = new SCNode(v);
			+

			while (i < p - 1 && temp.getNext()!= head) {
				temp = temp.getNext();
				i++;
			}
			// invalid position
			if (temp == null) {
				System.out.println("Invalid Position");
				return false;
			}
			// insertion of SCNode at it's valid position
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
			SCNode temp = head;
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
			SCNode t = temp.getNext();
			temp.setNext(t.getNext());
			t.setNext(null);
			System.out.println("\nSCNode deleted -" + t.getData());
		}
		return true;
	}

}
