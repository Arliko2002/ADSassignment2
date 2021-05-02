package assignment;

public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        System.out.println("Empty - " + heap.isEmpty());
        System.out.println("Inserting...");
        heap.insert(90);
        heap.insert(69);
        heap.insert(88);
        heap.insert(22);
        heap.insert(67);
        heap.printArray();
        System.out.println("Empty - " + heap.isEmpty());
        System.out.println("The size:" + heap.getSize());
        System.out.println("Min: " + heap.getMin());
        System.out.println("Delete min... Deleted element - " + heap.extractMax());
        heap.printArray();
        System.out.println("The size:" + heap.getSize());
    }
}
