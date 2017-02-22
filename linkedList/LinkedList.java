package ctci.linkedList;

public class LinkedList {
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
		while(node!= null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println("} ");
	}
	
	
	public void removeDups() {
		Node n = head, nextNode;
		while(n != null) {
			nextNode = n;
			while(nextNode.next != null) {
				if(nextNode.next.data == n.data) {
					nextNode.next = nextNode.next.next; 
				} else {
					nextNode = nextNode.next;
				}
			}
			n = n.next;
		}
	}
	
	public Node findKthToLast(int k) {
		int count = 0;
		Node n = head;
		while (n.next != null) {
			count++;
			n = n.next;
		}
		int fromStart = count-k;
		n = head;
		while (n.next != null) {
			if(fromStart == 0) break;
			fromStart--;
			n = n.next;
		}
		return n;

	}
	
	
	public Node findKthToLastIterative (int k) {
		Node p1 = head;
		Node p2 = head;
		int count = 0;
		while(p1.next != null) {
			if(count < k) {
				count++;
				p1 = p1.next;
			} else{
				p1 = p1.next;
				p2 = p2.next;
			}
			
		}
		return p2;
	}
	
	public void deleteMiddleNode() {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			System.out.println("fast is : "+ fast.data+ "slow is : "+ slow.data );
			fast=fast.next.next;
			slow = slow.next;
		}
		deleteNode(slow.data);
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(0);
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);
		list.append(9);
		list.printList();
		
		//list.deleteNode(4);
		//list.removeDups();
		//list.printList();
		//System.out.println(list.findKthToLast(4).data);
		//System.out.println(list.findKthToLastIterative(4).data);
		list.deleteMiddleNode();
		list.printList();
		
	}
}
