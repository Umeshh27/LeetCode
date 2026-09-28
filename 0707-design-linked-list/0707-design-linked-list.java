class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class MyLinkedList{
    Node head;
    int size;

    public MyLinkedList(){
        head=null;
        size=0;
    }

    public int get(int index){
        if(index<0||index>=size)return -1;

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val){
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        size++;
    }

    public void addAtTail(int val){
        Node newnode=new Node(val);

        if(head==null){
            head=newnode;
            size++;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
        size++;
    }

    public void addAtIndex(int index,int val){
        if(index<0)index=0;
        if(index>size)return;

        if(index==0){
            addAtHead(val);
            return;
        }

        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        Node newnode=new Node(val);
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }

    public void deleteAtIndex(int index){
        if(index<0||index>=size)return;

        if(index==0){
            head=head.next;
            size--;
            return;
        }

        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
        size--;
    }
}