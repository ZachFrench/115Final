public class StringStack{
    //first in last out.
    public LLNode<String> head = new LLNode<String>();

    //check if stack is empty.
    public boolean isEmpty(){
        if(head==null){
            return true;
        }

        return false;
    }

    // removes top item and returns it.
    public String pop() throws StackEmptyException{
        LLNode<String> curr = head;
        LLNode<String> removed;
        if(head==null){
            throw new StackEmptyException("ERROR: The stack is empty. Nothing could be retrieved.");
        }

        while(curr.next!=null){
            curr=curr.next;
        }

        removed = curr;
        curr = null;
        return removed.data;

    }

    //returns item at top of stack.
    public String peek(){
        LLNode<String> curr = head;
        if(head==null){
            throw new StackEmptyException("ERROR: The stack is empty. Nothing could be retrieved.");
        }

        while(curr.next!=null){
            curr=curr.next;
        }

        return curr.data;
        
    }

    //places item at top of stack.
    public void push(String item){
        LLNode<String> temp = new LLNode();
        LLNode<String> curr = head;
        temp.data=item;
        if(head==null){
            head = temp;
        }

        if(head!=null){
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    //empties the stack.
    public void popAll(){
        head = null;

    }

    public static void main(String[] args) {
        
    }


}