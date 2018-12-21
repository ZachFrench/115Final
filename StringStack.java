public class StringStack{
    //first in last out.
    public LLNode<String> head = null;

    //check if stack is empty.
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }

    // removes top item and returns it.
    public String pop() throws StackEmptyException{
       LLNode<String> removed = head;
        if (head==null){
            throw new StackEmptyException("Error: The stack is empty. Nothing could be retrieved");
        }
        if(head.next ==null){
            head = null;
            return removed.data;
        }

        head = head.next;
        return removed.data;
    }

    //returns item at top of stack.
    public String peek(){
        LLNode<String> curr = head;
        if(head==null){
            throw new StackEmptyException("ERROR: The stack is empty. Nothing could be retrieved.");
        }

        return head.data;
        
    }

    //places item at top of stack.
    public void push(String item){
        LLNode<String> temp = new LLNode(item);

        if(head==null){
            head = temp;
        }

        if(head!=null){
        temp.next = head;
        head = temp;
        }
    }

    //empties the stack.
    public void popAll(){
        head = null;

    }

    public static void main(String[] args) {
        StringStack zachStack = new StringStack();
        System.out.println("Checking isEmpty(): " + zachStack.isEmpty());
        System.out.println("Adding 3 elements to list: Test1, Test2, Test3.");
        zachStack.push("Test1");
        zachStack.push("Test2");
        zachStack.push("Test3");

        System.out.println();
        System.out.println("Checking isEmpty method: " + zachStack.isEmpty());
        System.out.println("Peeking: " + zachStack.peek());
        System.out.println();
        System.out.println("Popping: " + zachStack.pop());
        System.out.println("Peeking: " + zachStack.peek());
        System.out.println();
        System.out.println("Popping: " + zachStack.pop());
        System.out.println("Peeking: " + zachStack.peek());
        System.out.println("Popping: " + zachStack.pop());
        System.out.println("Peeking: " + zachStack.peek());
        System.out.println("The stack is now empty: " + zachStack.isEmpty());
        System.out.println();

        System.out.println("Adding strings: 123, 456, 789");
        zachStack.push("123");
        zachStack.push("456");
        zachStack.push("789");
        System.out.println("Checking if stack is empty: "+ zachStack.isEmpty());
        System.out.println("Popping: " + zachStack.pop());
        System.out.println("Peeking: " + zachStack.peek());
        System.out.println("Popping all.");
        zachStack.popAll();
        System.out.println("Checking to see if stack is now empty: " + zachStack.isEmpty());


        
    }


}