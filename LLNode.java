public class LLNode<E>
{
    public E data;
    public LLNode<E> next;

    //empty constructor
    public LLNode()
    {
        this.data = null;
        this.next = null;
    }

    //constructor to take data
    public LLNode(E info){
        this.data=info;
        this.next = null;

    }

    public LLNode(E info, LLNode<E> nextNode){
        this.data = info;
        this.next = nextNode;
    }

    

}