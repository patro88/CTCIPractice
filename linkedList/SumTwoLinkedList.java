package ctci.linkedList;

public class SumTwoLinkedList {
	private Node head;
	
	class Node {
		private int data;
		private Node next;
		public Node(int d) {
			data = d;
		}
		public Node() {}
		
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		Node node = head; 
		if(node == null) head = newNode;
		else {
			while(node.next != null) {
				node = node.next;
			}
			node.next = newNode;	
		}
	}
	
	public void deleteNode (int val) {
		Node node = head;
		if(node.data == val) {
			head = null;
		} else {
			while(node.next != null) {
				if(node.next.data == val) {
					node.next = node.next.next;
				}
				node = node.next;
			}
		}
	}
	
	public void printList() {
		Node node = head; 
		System.out.print("{ ");
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("} ");
	}
	
	
	public SumTwoLinkedList sumLists(SumTwoLinkedList list2) {
		Node n1 = this.head;
		Node n2 = list2.head;
		SumTwoLinkedList sumList = new SumTwoLinkedList();
		int carry = 0, total = 0;
		while(n1 !=null || n2 != null) {
			if(n1 == null) {
				total = (n2.data)%10 + carry;
				carry = (n2.data)/10;
				sumList.head = insertSum(sumList.head, total);
				n2 = n2.next;
			}else if(n2 == null) {
				total = (n1.data)%10 + carry;
				carry = (n1.data)/10;
				sumList.head = insertSum(sumList.head, total);
				n1 = n1.next;
			}else {
				total = (n1.data + n2.data)%10 + carry;
				carry = (n1.data + n2.data)/10;
				sumList.head = insertSum(sumList.head, total);
				n1 = n1.next;
				n2 = n2.next;
			}
			
		}
		if(carry != 0) {
			sumList.head = insertSum(sumList.head, carry);
		}
		return sumList;
		
	}
	
	private Node insertSum(Node sumHead, int total) {
		if(sumHead == null) {
			sumHead = new Node();
			sumHead.data = total;
			return sumHead;
		}
		
		Node sum = sumHead;
		while(sum.next != null) {
			sum = sum.next;
		}
		sum.next = new Node();
		sum.next.data = total;
		sum = sum.next;
		return sumHead;
	}
	
	public static void main(String[] args) {
		SumTwoLinkedList list1 = new SumTwoLinkedList();
		list1.append(7);
		list1.append(1);
		list1.append(6);
		list1.append(2);
		list1.printList();
		
		SumTwoLinkedList list2 = new SumTwoLinkedList();
		list2.append(5);
		list2.append(9);
		list2.append(2);
		list2.append(6);
		list2.printList();
		
		SumTwoLinkedList sum  = list1.sumLists(list2);
		sum.printList();
		
	}
}
