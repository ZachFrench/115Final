public class ZachList{
    
    private LLNode<Integer> head = new LLNode<Integer>();
    
    public ZachList(){
        head = null;
        
    }

    public int getLength(){
        LLNode<Integer> curr = head;
        int length = 0;

        if(curr == null){
            return length;
        }
        while(curr!=null){
            length++;
            curr=curr.next;
        }

        return length;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    public void removeHead(){
        LLNode<Integer> curr = head;

        if(curr==null){
            throw new ListEmptyException("Error: List is empty, cannot remove head item.");
        }

        if(curr.next==null){
            head=null;
        }


        curr = curr.next;
        head = curr;

    }

    public void remove(int value)
    {
        // do it later.


    }

    public boolean insert(int newData)
    {
        LLNode<Integer> curr = head;
        LLNode<Integer> newNode = new LLNode<Integer>(newData);

        
        newNode.data = newData;

        if(head==null){
            head=newNode;
            return true;
        }
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next = newNode;
        return true;
    }

    public int retrieve(int position){
        LLNode<Integer> curr = head;

        //if head is null, throw empty list exception.
        if(head==null){
            throw new ListEmptyException("The list is empty, therefore a value can not be retrieved");
        }

        //ADD A METHOD TO HANDLE IF THE POSITION IS OUTSIDE OF LIST PARAMETERS.

        //iterate through list and return requested value.
        for(int i = 1; i<position; i++){
            curr=curr.next;
        }

        return curr.data;
    }

    public void removeAll(){
        head = null;
    }
    public static void main(String[] args) {
        ZachList list1 = new ZachList();

        //insert values into list
        System.out.println("Adding the value '14' ");
        list1.insert(14);
        System.out.println("Adding the value '12'");
        list1.insert(12);
        System.out.println("Adding the value '47'");
        list1.insert(47);
        System.out.println();
        System.out.println();

        //testing isEmpty method
        System.out.println("TESTING ISEMPTY METHOD");
        System.out.println("Is the list empty?");
        System.out.println(list1.isEmpty());
        System.out.println();
        System.out.println();

        //testing getLength method
        System.out.println("TESTING GETLENGTH METHOD:");
        System.out.println("What is the length of the list?");
        System.out.println(list1.getLength());
        System.out.println();
        System.out.println();

        //testing retrieve method
        System.out.println("TESTING RETRIEVE METHOD:");
        System.out.println("Retrieve item at position 1: " + list1.retrieve(1));
        System.out.println("Retrieve item at position 3: " + list1.retrieve(3));
        System.out.println("Retrieve item at position 2: " + list1.retrieve(2));
        System.out.println();
        System.out.println();

        //testing remove method.
        System.out.println("TESTING REMOVEALL METHOD:");
        list1.removeAll();
        System.out.println("removeAll has been called. List is empty: " + list1.isEmpty());
        System.out.println("TESTING RETRIEVE ON AN EMPTY LIST");
        System.out.println("uncomment following line to test. As of now, it works.");
        //list1.retrieve(1);

        System.out.println("Inserting values: 4, 5, 6.");
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
        System.out.println("Retrieve item at position 1: ");
        System.out.println(list1.retrieve(1));
        System.out.println("Current length of list is: ");
        System.out.println(list1.getLength() + " items long.");
        System.out.println("Removing the head: ");
        list1.removeHead();
        System.out.println("New length = " + list1.getLength()+" items long");
        System.out.println("New value at position 1 is " + list1.retrieve(1));

        System.out.println("PASSED :)");



    }
    
}