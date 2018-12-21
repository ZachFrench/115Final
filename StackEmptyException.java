public class StackEmptyException extends RuntimeException{

    StackEmptyException(){
        super();
    }

    StackEmptyException(String msg){
        super(msg);
    }
}