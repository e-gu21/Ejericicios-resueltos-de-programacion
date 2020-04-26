package tournament;

import java.util.*;
class Team implements Comparable<Team>{
    public String teamname;
    private int wins;
    
    //Inicializar los datos con los del constructor
    public Team(String name, int numwins){
        teamname=name;
        wins=numwins;
    }
    
    //Retorna el nombre de los equipos dados
    public String getname(){
        return teamname;
    }
    
    //retorna -1,0,1 para = >
    public int compareTo(Team other){
        if(this.wins<other.wins)
            return -1;
        else
            if(this.wins==other.wins)
                return 0;
            else
                return 1;
    }
    
    //Retorna el nombre del equipo
    public String toString(){
        return teamname;
    }
}
