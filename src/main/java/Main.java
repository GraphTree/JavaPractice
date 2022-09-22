public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");

        Team herickTeam = new Team("herickTeam");
        herickTeam.addPlayer(joe);
        herickTeam.addPlayer(pat);

        System.out.println(herickTeam.numPlayers());

    }
}
