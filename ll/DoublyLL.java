package DSDay2;

public class DoublyLL {
    Node head;
    Node tail;
    int size;

    public DoublyLL() {
        this.size=0;
    }


    public void insert(int value){
        Node node= new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=null;
            head.prev=null;
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            tail=node;
        }
        size++;
    }



    public void inserF(int value){
        if(head==null){
            insert(value);
            return;
        }
        Node node = new Node(value);
        Node temp=head;
        node.next=temp;
        temp.prev=node;
        head=node;
        node.prev=null;
        size++;
    }




    public void deleteF(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }



    public void deleteL(){
        if(head==null){
            System.out.println("Linkedlist empty");
            return;
        }
        Node temp= tail;
        temp=temp.prev;
        temp.next=null;
        tail=temp;
        size--;
    }





    public void insertAt(int value,int pos){

        if(pos>size){
            System.out.println("LinkedList size is less than given position");
            return;
        }
        if(pos==1){
            inserF(value);
            return;
        }if(pos==size+1){
            insert(value);
            return;
        }
        Node node = new Node(value);
        Node temp= head;
        for (int i = 2; i <pos ; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        node.prev=temp;
        temp.next=node;

        size++;
    }


    public void deleteAt(int pos){
        if(pos==size){
            deleteL();
            return;
        }
        if(pos==1){
            deleteF();
            return;
        }
        Node temp=head;
        for (int i = 2; i <pos ; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
        size--;
    }










    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("TAIL");
        System.out.println(size);
    }
}
