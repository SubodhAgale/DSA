package DSDay2;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLL d1 =new DoublyLL();
        d1.insert(10);
        d1.insert(20);
        d1.insert(30);
        d1.inserF(55);
//        d1.deleteF();
//        d1.display();
//        d1.deleteL();
//        d1.display();
//
        d1.display();
        d1.insertAt(89,6);
        d1.display();
        d1.deleteAt(2);
        d1.display();
    }
}
