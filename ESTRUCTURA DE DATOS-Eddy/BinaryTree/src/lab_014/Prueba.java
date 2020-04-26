package lab_014;
public class Prueba {
    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();  //Se crea el árbol
        theTree.addNode(58, "-");
        theTree.addNode(29, "/");
        theTree.addNode(20, "*");
        theTree.addNode(11, "+");              
        theTree.addNode(7, "3"); //Se añade la Llave y el jefe
        theTree.addNode(15, "1"); //Se añade la Lllave y el gerente de oficina
        theTree.addNode(24, "3");//Se añade la Llave y gerente de ventas
        theTree.addNode(48, "+");
        theTree.addNode(39, "-");
        theTree.addNode(35, "9");
        theTree.addNode(43, "5");
        theTree.addNode(52, "2");
        theTree.addNode(87, "+");
        theTree.addNode(68, "*");
        theTree.addNode(64, "3");
        theTree.addNode(77, "-");        
        theTree.addNode(73, "7");
        theTree.addNode(81, "4");
        theTree.addNode(91, "6");
        
        
        System.out.println("En orden");
        theTree.inOrderTraverseTree(theTree.root); //En orden
        System.out.println("\nEn preorden");
        theTree.preorderTraverseTree(theTree.root);//Preorden
        System.out.println("\nEn posorden");
        theTree.postOrderTraverseTree(theTree.root);
        
        
        
        //Es del modo preorden para que al momento de recorrerlo en orden y posorden
        //Puedan tener una lectura más fácil y así una representación del árbol 
        //Más simple.
    }
    
}
