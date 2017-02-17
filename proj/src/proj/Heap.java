/*package proj;

public class Heap {
	
	int heapSize ;
	int [] heapArr; 
	int capacity;
	
	
	public Heap(int cap) {
		capacity = cap;
		heapSize = 0;
		heapArr = new int[cap];
	}
	
	public int extractMin() {
		if(heapSize > 0) {
			return heapArr[heapSize-1];
		} else {
			return Integer.MIN_VALUE;
		}
	}
	
	private void swap(int i, int j) {
		int temp = heapArr[i];
		heapArr[i] = heapArr[j];
		heapArr[j] = temp;
	}
	
	private int getParent(int i) {
		return (i-1)/2;
	}
	
	private int getLeft(int i) {
		return 2 * i + 1;
	}
	
	private int getRight(int i) {
		return 2 * i + 2;
	}
	
	private void MinHeapify(int i) {
		for(int i = 1; i<heapSize-1; i++) {
			while(i != 0 && heapArr[getParent(i)] > heapArr[i]){
				swap(i, getParent(i));
				i = getParent(i);
			}
		}
	}
	
	
	public void levelOrderTraverse(Node n, int l) {
		if(n == null) return;
		else if(l == 1) {
			System.out.print(n.data + " ");
		} else if(l > 1) {
			levelOrderTraverse(n.left, l-1);
			levelOrderTraverse(n.right, l-1);
		}
	}
	
	
	public int diamTree(Node n, int h) {
		if(n == null) ; return 0;
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}
}
*/