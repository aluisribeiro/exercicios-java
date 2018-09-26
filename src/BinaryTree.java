
public class BinaryTree {
	
	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public int sumTheNextOnes() {
		int total = 0;
		BinaryTree localRight = right;
		
		while(localRight != null) {
			total += right.valor;
			localRight = localRight.right;
		}
		
		return total;
	}

}
