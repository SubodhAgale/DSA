package Stack;

public class StackMain {

    public static void main(String[] args) {
//        StackUsingArray s= new StackUsingArray(10);
//
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//        s.push(50);
//        s.display();
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        s.display();
//        s.peek();
//

        StackUsingLL l = new StackUsingLL();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.display();
        l.pop();
        l.display();
    }
}