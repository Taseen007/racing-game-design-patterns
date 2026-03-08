package player;

public class Player {

    private static Player instance;
    private String name;

    private Player(String name){
        this.name = name;
    }

    public static Player getInstance(String name){

        if(instance == null){
            instance = new Player(name);
        }

        return instance;
    }

    public void playerInfo(){
        System.out.println("Player: " + name);
    }
}