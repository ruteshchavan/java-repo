// Initializing object through method.

class Team {
    int teamsize;
    String sport;

    void play(int x, String y){
        teamsize=x;
        sport=y;
    }

    void output(){
        System.out.println("Total Players : "+teamsize);
        System.out.println("Sport : "+sport);
    }
}

public class ObjectClass2 {
    public static void main(String[] args) {
       Team s1=new Team();
       s1.play(11,"Football");
       Team s2=new Team();
       s2.play(2,"Badminton");
       s1.output();
       s2.output();
    }
}
