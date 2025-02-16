package ipaQuestion;
import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String getMatchType() {
        return matchType;
    }
}

public class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int playerId = sc.nextInt();
            sc.nextLine();  
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();

            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String targetPlayerType = sc.nextLine();
        String targetMatchType = sc.nextLine();

        int lowestRuns = findPlayerWithLowestRuns(players, targetPlayerType);
        if (lowestRuns > 0) {
            System.out.println(lowestRuns);
        } else {
            System.out.println("No such player");
        }

        Player[] matchedPlayers = findPlayerByMatchType(players, targetMatchType);
        if (matchedPlayers != null) {
            for (int i = 0; i < matchedPlayers.length; i++) {
                System.out.println(matchedPlayers[i].getPlayerId());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }

    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int lowestRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getPlayerType().equalsIgnoreCase(playerType)) {
                if (players[i].getRuns() < lowestRuns) {
                    lowestRuns = players[i].getRuns();
                    found = true;
                }
            }
        }

        return found ? lowestRuns : 0;
    }

    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        Player[] matchedPlayers = new Player[players.length];
        int count = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchType().equalsIgnoreCase(matchType)) {
                matchedPlayers[count++] = players[i];
            }
        }

        if (count == 0) {
            return null;
        }

        // Sorting players in descending order of playerId (Selection Sort)
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (matchedPlayers[i].getPlayerId() < matchedPlayers[j].getPlayerId()) {
                    Player temp = matchedPlayers[i];
                    matchedPlayers[i] = matchedPlayers[j];
                    matchedPlayers[j] = temp;
                }
            }
        }

        return Arrays.copyOf(matchedPlayers, count);
    }
}
