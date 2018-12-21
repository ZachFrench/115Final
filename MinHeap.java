public class MinHeap{

    Array[] theHeap;
    int size;

    public static void main(String[] args) {
        //insert 5 values.
    }

    public MinHeap(){
        size=0;
    }

    public MinHeap(Array[] array){
        size=array.length;
        theHeap = array;

        //after taking in values, arrange them in the array.
        buildHeap();
    }

    public void buildHeap(){
        for(int k = size/2; k>0; k--){
            percolateDown(k);
        }
    }

    percolateDown(int k){
        int temp = heap[k];
        int child;

        for(; 2*k <=size; k=child){
            if(child!=size && theHeap[child+1]>0) {
                child++;
            }
            if(temp.compareTo(heap[child])>0){
                heap[k]=heap[child];
            }else{
                break;
            }
        }
        heap[k]=temp;
    }

    heapSort(array[] anArray){

    }


}