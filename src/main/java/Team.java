import java.sql.Array;
import java.util.ArrayList;

public class Team {
    private String name;
    public int played= 0;
    public int won =0;
    public int lost=0;
    public int tied=0;

    private ArrayList<Player> members = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() +"is already on t");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team" + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            this.won ++;
        } else if(ourScore == theirScore){
            this.tied++;
        } else {
            lost++;
        };

        if(opponent!=null){
            opponent.matchResult(null, theirScore, ourScore);
        };
    }

    public int ranking(){
        return (won * 2) + tied;
    }

}

