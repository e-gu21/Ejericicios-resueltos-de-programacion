package pilas;
public class MiPila {
   private long stackArray[];         //Se crea la pila
   private int maxDim;                //dimension de la la pila;
   private int top;                   // Parte alta de la pila
////////////////////////////////////////////////////////////////////////   
   public MiPila(int s) // constructor
   { 
    maxDim = s;                        // Establece el tabaño del array
    stackArray = new long[maxDim];     // Crea el array
    top = -1;                          // Aún no se implementa un item
   }
////////////////////////////////////////////////////////////////////////    
  public void push (long j){           //Se agrega un item al top de la pila
      stackArray[++top]=j;             //Incrementa la pila
  }
////////////////////////////////////////////////////////////////////////    
  public long pop()                     // Toma un item de la pila
  {
  return stackArray[top--];            // Se reduce la pila
 }
////////////////////////////////////////////////////////////////////////  
  public long peek()                   // Examina un item de la pila
  {
  return stackArray[top];
  }
//--------------------------------------------------------------
  public boolean isEmpty()             // Verifica si la pila está vacía 
  {
  return (top == -1);
  }
////////////////////////////////////////////////////////////////////////  
  public boolean isFull()              // Verifica si la pila está llena
  {
  return (top == maxDim-1);
  }
}
