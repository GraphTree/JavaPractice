public class Monster {
    // write code here
    private String name;
    private int hitPoints;
    private int Strength;

    public Monster(String name, int hitPoints, int Strength){
        this.name = name;
        this.Strength = Strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return Strength;
    }
}