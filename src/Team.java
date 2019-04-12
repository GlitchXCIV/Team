import java.util.ArrayList;

public class Team {
    private String teamName;
    private String teamCity;
    private int counterPlayers;
    private ArrayList<Player> players;

    public Team(String teamName, String teamCity) { /*costruttore*/
        this.teamName = teamName;
        this.teamCity = teamCity;
        this.counterPlayers = 0;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void addPlayer(Player player)
    {
        this.players.add(player);
        this.counterPlayers++;
    }

    public ArrayList<Player> findPlayerByName(String name) {
        ArrayList<Player> foundPlayer = new ArrayList<>();
        for (int i=0; i<this.counterPlayers;i++) {
            if (players.get(i).getName().equalsIgnoreCase(name)) {
                foundPlayer.add(players.get(i));
            }
        }
        return foundPlayer;
    }

    public ArrayList<Player> findPlayerByRole(String role) {
        ArrayList<Player> foundPlayer = new ArrayList<>();
        for (int i=0; i<this.counterPlayers;i++) {
            if (players.get(i).getRole().equalsIgnoreCase(role)) {
                foundPlayer.add(players.get(i));
            }
        }
        return foundPlayer;
    }
}