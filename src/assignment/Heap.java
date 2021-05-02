package assignment;

public class Heap {
    private int[] AllHeap;
    private int size;
    private int maxsize;
    private int min;
    private int indexmin;

    public Heap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        AllHeap = new int[this.maxsize + 1];
        AllHeap[0] = Integer.MAX_VALUE;
    }
    static int parent(int i) { return (i - 1) / 2; }
    static int leftChild(int i) { return ((2 * i) + 1); }
    static int rightChild(int i) { return ((2 * i) + 2); }

    private void swap(int a, int b)
    {
        int s;
        s = AllHeap[a];
        AllHeap[a] = AllHeap[b];
        AllHeap[b] = s;
    }

    public void insert(int element)
    {
        AllHeap[++size] = element;
    }

    public void minHeap(){
        min = AllHeap[0];
        for (int i = 0; i <size; i++){
            if(AllHeap[i] < min){
                min = AllHeap[i];
                indexmin = i;
            }
        }
    }

    public int extractMax(){
        int n = min;
        for (int i = indexmin; i < size - 1; i++) {
            AllHeap[i] = AllHeap[i + 1];
        }
        size--;
        return n;
    }

    public int getMin() {
        minHeap();
        return min;
    }

    public boolean isEmpty(){
        if(size == 0) { return true; }
        else { return false; }
    }

    public void printArray()
    {
        for (int i = 1; i <= size; ++i)
            System.out.print(AllHeap[i] + " ");
        System.out.println();
    }


    public int getSize() {
        return size;
    }
}
