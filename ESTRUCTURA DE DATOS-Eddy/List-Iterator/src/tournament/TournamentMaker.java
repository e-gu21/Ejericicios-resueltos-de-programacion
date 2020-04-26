package tournament;
import java.util.Scanner;
import java.io.*;
public class TournamentMaker {
    public void make(){
        ArrayOrederedList<Team> tournament= new ArrayOrederedList<Team>(); //Arreglo de equipos
        String team1, team2, nameteam; //Equipos
        int numwins, numteams=0; //Cantidad de victorias y de equipos
        Scanner in=new Scanner(System.in);
        System.out.println("TOURNAMENT MAKER");
        while((numteams%2)!=0||(numteams==0))  //Ingreso solo de pares
        {
            System.out.println("Ingrese el número de equipos (par): " );
            numteams=in.nextInt();
            in.nextLine();
        }
        System.out.println("Ingrese"+numteams+" el nombre de los equipos "+"y el número de victorias: ");
        System.out.println("Los equipos pueden ser ingresados en cualquier orden");
          for(int count=1;count<=numteams;count++){   //Verifica para que se ingrese correctamente el nombr4e del equipo y sus victorias
              System.out.println("Ingrese el nombre del equipo: ");
              nameteam=in.nextLine();
              System.out.println("Ingrese el número de victorias: ");
              numwins=in.nextInt();
              in.nextLine();
              tournament.add(new Team(nameteam,numwins)); //Equipo y su número de victorias 
          }
        System.out.println("La primera ronda de partidos consta de: ");
        for(int count =1; count<=(numteams/2);count++){ //Verifica que los equipos seqan los correctos
            team1=(tournament.removeFirst()).getname(); //Elimina al primer elemento
            team2=(tournament.removeLast()).getname(); //Elimina al último elemento
            System.out.println("Partido "+count+"es "+team1+"vs "+team2);
            System.out.println("El ganador jugará contra el ganador del partido " +(((numteams/2)+1)-count));


        }
    }
    
}


