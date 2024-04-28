package Stack;

public class StackUsingLL {
    Node top;

    public void push(int data){
        System.out.println("inside pop");
        Node newnode= new Node(data);
        if(top==null){
            top=newnode;
            return;
        }
        else{
            newnode.prev=top;
            top=newnode;
          //  System.out.println(top.data);
            return;
        }
    }

    public int pop(){
     if(isEmpty()){
         System.out.println("Stack Underflow");
         return -1;
     }
       // System.out.println("Popped Element is:"+top.data);
        Node temp=top;
        top=top.prev;
      //  temp.prev=null;
        return temp.data;

    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Top element of Stack is: "+top.data);
    }
    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        else
            return false;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Stack Elements: ");
        for(Node temp=top; temp!=null; temp=temp.prev){
            System.out.println(temp.data);
        }
    }
}

