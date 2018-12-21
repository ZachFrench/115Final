public class ZachQueue{
    //first in first out

    LLNode<String> head = null;
    LLNode<String> tail = null;

    //if queue is empty, return true.
    public boolean isEmpty(){
        if(head==null){
            return true;
        }

        return false;

    }

    //If queue does not exist, create one. If queue does exist, add item to back.
    public void enqueue(String newString) throws QueueException{
        LLNode<String> newItem = new LLNode<String>(newString);
        if(head==null && tail==null){
            head=newItem;
            tail=newItem;
        }
        if(tail!=null){
            tail.next=newItem;
            tail=tail.next;
        }

    }

    //remove item at frond of queue and return its data.
    public String dequeue() throws QueueException{
        LLNode<String> removed = head;
        if(head==null){
            throw new QueueException("ERROR: Queue is empty therefore nothing could be removed.");
        }
        
        head=head.next;
        return removed.data;

    }

    //remove all items from queue.
    public void dequeueAll(){
        head=null;
        tail=null;

    }

    public String peek() throws QueueException{
        if(head==null){
            throw new QueueException("ERROR: the queue is empty, therefore nothing could be returned.");
        }
        
        return head.data;
    }

    public static void main(String[] args) {
        ZachQueue queue1 = new ZachQueue();
        System.out.println("Testing isEmpty method: " + queue1.isEmpty());
        System.out.println("Queue named 'queue1' has been created. Adding element 'Test1'");
        queue1.enqueue("Test1");
        System.out.println("Adding element 'Test2'");
        queue1.enqueue("Test2");
        System.out.println("Peeking queue1: " + queue1.peek());
        System.out.println("Testing isEmpty method: " + queue1.isEmpty());
        System.out.println("Testing dequeue. Item removed: " + queue1.dequeue());
        System.out.println("Peeking queue1 to confirm dequeue: " + queue1.peek());
        System.out.println();
        System.out.println();
        System.out.println("Removing Test2 from queue: " + queue1.dequeue());
        System.out.println("Testing isEmpty(): " + queue1.isEmpty());

        System.out.println();
        System.out.println();
        System.out.println("Adding 3 items to the Queue: TestA, TestB, TestC.");
        queue1.enqueue("TestA");
        queue1.enqueue("TestB");
        queue1.enqueue("TestC");
        System.out.println("Testing if queue is empty: " + queue1.isEmpty());
        System.out.println("Testing dequeue all.");
        queue1.dequeueAll();
        System.out.println("Running isEmpty: "+queue1.isEmpty());

    }
}