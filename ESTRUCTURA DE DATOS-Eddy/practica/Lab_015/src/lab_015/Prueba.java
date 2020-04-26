package lab_015;
public class Prueba {
    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();  //Se crea el árbol
        theTree.addNode(33, "8");
        theTree.addNode(9, "5");
        theTree.addNode(5, "9");
        theTree.addNode(18, "7");              
        theTree.addNode(14, "1"); //Se añade la Llave y el jefe
        theTree.addNode(27, "12"); //Se añade la Lllave y el gerente de oficina
        theTree.addNode(23, "2");//Se añade la Llave y gerente de ventas
        theTree.addNode(37, "4");
        theTree.addNode(46, "11");
        theTree.addNode(42, "3");
              
        
        System.out.println("En orden");
        theTree.inOrderTraverseTree(theTree.root); //En orden
        System.out.println("\nEn preorden");
        theTree.preorderTraverseTree(theTree.root);//Preorden
        System.out.println("\nEn posorden");
        theTree.postOrderTraverseTree(theTree.root);
        System.out.println("\nEn Level");
        theTree.printLevelOrder();
        
        
        
        //Es del modo preorden para que al momento de recorrerlo en orden y posorden
        //Puedan tener una lectura más fácil y así una representación del árbol 
        //Más simple.
    }
    
}
