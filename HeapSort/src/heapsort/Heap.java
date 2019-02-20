package heapsort;

public class Heap {
	
	public void viewHeap(Integer[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
	}
	
	public Integer[] createHeap (Integer[] numbers) {
		int nodeCount = numbers[0];
		int initialNode = nodeCount/2;
		for (int i = initialNode; i > 0; i--) {
			numbers = swapNodes(numbers, i);
		}
		for (int i = 1; i <= initialNode; i++) {
			numbers = swapNodes(numbers, i);
		}
		return numbers;
	}
	
	
	public Integer[] swapNodes (Integer[] numbers, int i) {
		
		Integer leftChild = null;
		Integer rightChild = null;
		Integer maxChild = null;
		Integer index = null;
		
		if(!((2*i)>numbers.length)) {
			 leftChild = numbers[2*i];
		}
		
		if(!(((2*i)+1)>=numbers.length)) {
			 rightChild = numbers[2*i+1];
		}
		
		if(leftChild!=null && rightChild != null) {
			 maxChild = Math.max(leftChild, rightChild);
			 if(maxChild == leftChild) {
				 index = 2*i;
			 }else {
				 index = (2*i)+1;
			 }
		}else if (leftChild == null) {
			 maxChild = rightChild;
			 index = (2*i)+1;
		}else if(rightChild == null) {
			 maxChild = leftChild;
			 index = 2*i;
		}
		
		if(maxChild!=null) {
			if(maxChild > numbers[i]) {
				int temp = numbers[i];
				numbers[i] = numbers[index];
				numbers[index] = temp;
			}
		}
		
		return numbers;
	}
	
	public Integer[] sortHeap(Integer[] numbers) {
		int count = numbers[0];
		for (int i = count; i > 0 ; i--) {
			int temp = numbers[1];
			numbers[1] = numbers[i];
			numbers[i] = temp;
			int j=1,child;
			do {
				child = (2 * j); 
				if(!(child+1>count)) {
					if (numbers[child] < numbers[child + 1] && child < (i-1)) {
						child++;
					}
				}
				if(!(child>count)) {
					if (numbers[j] < numbers[child] && child < i) {
						int temp2 = numbers[j];
						numbers[j] = numbers[child];
						numbers[child] = temp2;
					}
				}
				j++;
			} while (child < i);
			
			numbers[0] = numbers[0]-1;
			
		}
		
		return numbers;
	}
}
