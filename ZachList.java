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
        //fuck it do it later.


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
        for(int i = 1; i<=position; i++){
            curr=curr.next;
        }

        return curr.data;
    }
    public static void main(String[] args) {
        ZachList list1 = new ZachList();
        list1.insert(14);
        list1.insert(12);
        list1.insert(47);

        System.out.println(list1.isEmpty());
        System.out.println(list1.getLength());


    }
    
}