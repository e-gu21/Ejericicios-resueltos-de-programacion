package lab_002;
public class Lab_002 {
    public static void main(String[] args) {

      String numero[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
      String palo[]={"Diamantes", "Corazones" , "Treboles", "Espadas"}; 

       /*int n=Integer.parseInt(args[0]);
       String[]cartas=new String [52];
       for(int i=0;i<numero.length;i++){
           for(int j=0;j<palo.length;j++){
              cartas[palo.length*i+j] = numero [i]+" de "+palo[j];
           }
       }
       for(int i=0;i<n;i++){
           System.out.println(cartas[i]);
       }*/
       
       String[] baraja = new String[52];
for (int i = 0; i < 13; i++)
   for (int j = 0; j < 4; j++)
      baraja[4*i + j] = numero[i] + " de " + palo[j];
System.out.println("EN ORDEN: ");
for (int i = 0; i < 52; i++)
    
   System.out.println(baraja[i]);

      int N= numero.length*palo.length;

for (int i = 0; i < N; i++) {
         int r = i + (int) (Math.random() * (N-i));
         String t = baraja[r];
         baraja[r] = baraja[i];
         baraja[i] = t;
      }

System.out.println("\nAL AZAR: ");
      for (int i = 0; i < N; i++)
          
         System.out.println(baraja[i]);

       
       
      
    }
    
}
