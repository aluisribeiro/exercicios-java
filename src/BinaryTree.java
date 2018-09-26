
public class BinaryTree {
	
	int valor;
	BinaryTree left;
	BinaryTree right;
	
	public int sumTheNextOnes() {
		int total = 0;
		BinaryTree localRight = right;
		
		while(localRight != null) {
			total += localRight.valor;
			localRight = localRight.right;
		}
		
		return total;
	}

}
