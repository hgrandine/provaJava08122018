package prova08122018;

public class exer9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//numero a ser procurado
		int numeroX = 10;
		
		//pegar o nó incial (falta pesquisar como realizar isso)
		Node root = BinaryTree.class;
		
		//colocar o nó raiz, numero a ser procurado e a soma (que no caso inicial é 0)
		int soma = procuraSoma(root, numeroX, 0);
	}
	//classe que procura o numero e vai somando conforme passa pelos numeros (falta resolver o problema com a recursividade)
	@SuppressWarnings("unused")
	public static int procuraSoma(Node current, int value, int soma) {
	    if (current == null) {
	        return (soma);
	    }
	 
	    if (value < current.value) {
	    	soma = current.value + soma;
	        current.left = procuraSoma(current.left, value, soma);
	    } else if (value > current.value) {
	    	soma = current.value + soma;
	        current.right = procuraSoma(current.right, value, soma);
	    } else {
	    	soma = current.value + soma;
	        return soma;
	    }
	 
	    return soma;
	}
	
	public class BinaryTree {
		int valor;
		Node root;
		BinaryTree left;
		BinaryTree right;
		
	}
	
	class Node {
	    int value;
	    Node left;
	    Node right;
	 
	    Node(int value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
	}
	
}
