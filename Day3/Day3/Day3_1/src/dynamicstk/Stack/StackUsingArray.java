package Stack;

public class StackUsingArray {

    int arr[];
    int top;

    public StackUsingArray(int size) {
       arr=new int[size];
       top=-1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        System.out.print("Element Popped from stack ");
        return arr[top--];
    }
    public void push(int data){
       if(isFull()){
           System.out.println("Stack Overflow");
           return ;
       }
       arr[++top]=data;
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }

    public boolean isFull(){
        if(top==arr.length-1){
            return true;
        }
        return false;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
             return;
        }
        System.out.println("Top element of stack "+arr[top]);

    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Stack elements are:");
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

}
