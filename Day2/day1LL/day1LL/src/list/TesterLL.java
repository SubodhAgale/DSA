//Implement Linked List for int values

package list;

public class TesterLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.insertAtBeg(23); //call to insert function will create 1st node in memory
		l1.insertAtBeg(56);
		l1.insertAtBeg(6);
		l1.insertAtBeg(8);
		l1.insertAtBeg(16);
		l1.insertAtBeg(88);
		l1.insertAtPos(11,1);
		l1.display(); //88  16  11  8  6  56  23  
		l1.deleteAtPos(7);
//		l1.deleteAtLast();
		l1.display();
//		
//		l1.search(56);
//		System.out.println("Reversed List - ");
//		l1.reverse();
//		l1.display();
		
		
	}

}
