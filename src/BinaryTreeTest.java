import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void shouldFormatNode() {
		BinaryTree a = this.createNodeA();
		int result = a.sumTheNextOnes();
		assertThat(result, equalTo(3));
		
		BinaryTree b = this.createNodeA().right;
		result = b.sumTheNextOnes();
		assertThat(result, equalTo(2));
	}
	
	private BinaryTree createNodeA() {
		BinaryTree a = new BinaryTree();
		a.valor = 1;
		
		BinaryTree b = new BinaryTree();
		b.valor = 1;
		
		BinaryTree c = new BinaryTree();
		c.valor = 1;
		
		BinaryTree d = new BinaryTree();
		d.valor = 1;
		
		a.right = b;
		
		b.left = a;
		b.right = c;
		
		c.left = b;
		c.right = d;
		
		d.left = c;
		
		return a;
		
	}

}
