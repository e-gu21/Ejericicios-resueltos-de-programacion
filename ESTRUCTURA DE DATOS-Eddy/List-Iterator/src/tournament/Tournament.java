package tournament;

import java.io.*;
//Hace correr la clase TounamentMaker 
public class Tournament {
    public static void main (String[]args)throws IOException {
        TournamentMaker temp = new TournamentMaker();
        temp.make();
    }
}