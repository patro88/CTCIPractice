package proj;

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int x) {
		data = x;
		left = right = null;
	}
}
public class BinTree {
	
	Node root;
	public BinTree(int data) {
		root = new Node (data);
	}
	
	public int heightOfBinTree(Node n) {
		if(n == null) {
			return 0;
		}
		return (1 + Math.max(heightOfBinTree(n.left), heightOfBinTree(n.right)));
		
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
	
	
	public int diamTree(Node n) {
		if(n==null) return 0;
		
		int lht = heightOfBinTree(n.left);
		int rht = heightOfBinTree(n.right);
		
		int ldia =  diamTree(n.left);
		int rdia =  diamTree(n.right);
		
		return Math.max(1+lht+rht, Math.max(ldia, rdia));
	}
	
	public static void main(String[] args) {
		BinTree tree = new BinTree(12);
		tree.root.left = new Node(10);
		tree.root.right= new Node(11);
		tree.root.left.left = new Node(9);
		tree.root.left.right = new Node(15);
		
		int dia = tree.diamTree(tree.root);
		System.out.println(dia);
		
		
	}
}
