package proj;



public class StackImpl {
	
	public class StackArr {
		int capacity;
		int[] arr;
		int top;
		
		public StackArr(int capacity) {
			this.capacity = capacity;
			this.top = -1;
			this.arr = new int[capacity]; 
		}
		
		public void push(int x) {
			if(top == capacity-1) {
				System.out.println("Stack Full !!!");
			}
			else {
				arr[top++] = x;
			}
		}
		
		public Integer pop() {
			if(top == -1) {
				System.out.println("Stack Empty !!!");
				return null;
			}
			else {
				return arr[top--];
			}
		}
	}	
	
	public void infixToPostFix(String expr) {
		
	}
	
	public static void main(String[] args) {
		
	}

}
