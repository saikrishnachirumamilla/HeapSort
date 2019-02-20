package heapsort;
public class UserInterface {

	public static void main(String[] args) {
		Heap heap = new Heap();
		Integer numbers [] = new Integer [] {20,63,94,80,47,58,11,8,86,83,99,17,39,100,93,68,72,79,65,6,89};
		//Integer numbers [] = new Integer [] {21,55, 27,	29,	95,	96,	72, 33,	33,	99,	11,	50, 70,	33,	47,	34,	79, 51,	94,	37,	88,	65};
		System.out.print("Number of nodes: ");
		System.out.println(numbers[0]);
		System.out.println("");
		System.out.print("Initial list of numbers: ");
		heap.viewHeap(numbers);
		numbers = heap.createHeap(numbers);
		System.out.println("");
		System.out.println("");
		System.out.print("Heap: ");
		heap.viewHeap(numbers);
		numbers = heap.sortHeap(numbers);
		System.out.println("");
		System.out.println("");
		System.out.print("Sorted Heap: ");
		heap.viewHeap(numbers);
	}

}
