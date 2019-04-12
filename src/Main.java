import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main (String [] args) {
        int answer;
        String nameTeam;
        boolean flag;
        Scanner scanIn = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Player> fondedPlayers = new ArrayList<>();
        do {
            System.out.println("MENU");
            System.out.println("1. Inserisci nuova squadra");
            System.out.println("2. Inserisci nuovo giocare");
            System.out.println("3. Cerca giocatore per nome");
            System.out.println("4. Cerca giocatore per ruolo");
            System.out.println("0. ESCI");
            answer = scanIn.nextInt();

            if (answer<0||answer>4) System.out.println("Inserimento errato");
            switch (answer) {
                case 1:
                    System.out.println("Inserisci nuova squadra");
                    String name = scanIn.next();
                    System.out.println("Inserisci la città della squadra");
                    String city = scanIn.next();
                    Team team = new Team(name, city);
                    teams.add(team);
                    break;
                case 2:
                    System.out.println("Inserisci nome squadra");
                    nameTeam = scanIn.next();
                    flag = false;
                    for (int i=0; i < teams.size();i++) {
                        if (teams.get(i).getTeamName().equalsIgnoreCase(nameTeam)) {
                            flag = true;
                            System.out.println("Inserisci nome giocatore");
                            String namePlayer = scanIn.next();
                            System.out.println("Inserisci cognome giocatore");
                            String surnamePlayer = scanIn.next();
                            System.out.println("Inserisci ruolo giocatore");
                            String role = scanIn.next();
                            System.out.println("Inserisci numero di maglia");
                            int number = scanIn.nextInt();
                            Player player = new Player(namePlayer, surnamePlayer,
                                    role, number);
                            teams.get(i).addPlayer(player);

                        }
                    }
                    if (!flag) System.out.println("Errore");
                    break;
                case 3:
                    flag = false;
                    System.out.println("Inserisci nome squadra");
                    nameTeam = scanIn.next();
                    for (int i=0; i<teams.size();i++) {
                        if(teams.get(i).getTeamName().equalsIgnoreCase(nameTeam)) {
                            System.out.println("Inserisci nome giocatore");
                            String namePlayer = scanIn.next();

                            fondedPlayers = teams.get(i).findPlayerByName(namePlayer);
                            flag = true;
                            break;
                        }
                    }
                    for (int i = 0; i < fondedPlayers.size(); i++) {
                        System.out.println(fondedPlayers.get(i).toString());
                    }
                    if (!flag)
                        System.out.println("Squadra non trovata");
                    break;
                 case 4:
                     flag = false;
                     System.out.println("Inserisci nome squadra");
                     nameTeam = scanIn.next();
                     for (int i=0; i<teams.size();i++) {
                         if(teams.get(i).getTeamName().equalsIgnoreCase(nameTeam)) {
                             System.out.println("Inserisci ruolo giocatore");
                             String rolePlayer = scanIn.next();

                             fondedPlayers = teams.get(i).findPlayerByRole(rolePlayer);
                             flag = true;
                             break;
                         }
                     }
                     for (int i = 0; i < fondedPlayers.size(); i++) {
                         System.out.println(fondedPlayers.get(i).toString());
                     }
                     if (!flag)
                         System.out.println("Squadra non trovata");
                     break;
            }
        }
        while (answer!=0);
    }
}
