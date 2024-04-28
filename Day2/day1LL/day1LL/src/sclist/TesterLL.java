//Implement Linked List for int values

package sclist;

public class TesterLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyCircularLinkedList l1=new SinglyCircularLinkedList();
		l1.insertAtBeg(23); //call to insert function will create 1st node in memory
		l1.insertAtBeg(56);
		l1.insertAtLast(6);
		l1.insertAtLast(8);
		l1.insertAtBeg(16);
		l1.insertAtBeg(88);
//		l1.insertAtPos(11,1);
		l1.display(); //88   16  56  23  6   8     
		l1.checkCircularity(8);


		//		l1.deleteAtPos(1);
//		l1.deleteAtLast();
//		l1.display();
//		
		l1.search(98);
//		System.out.println("Reversed List - ");
//		l1.reverse();
//		l1.display();
		
		
	}

}
