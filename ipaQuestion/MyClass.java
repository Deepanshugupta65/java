package ipaQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // Constructor
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    // Getters and setters
    public int getPlayerid() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getruns() {
        return runs;
    }

    public void setruns(int runs) {
        this.runs = runs;
    }

    public String getplayerType() {
        return playerType;
    }

    public void setPlayertype(String playerType) {
        this.playerType = playerType;
    }

    public String getmatchType() {
        return matchType;
    }

    public void setmatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class MyClass {
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

        sc.nextLine(); // to consume extra newline character
        String playertypesearch = sc.nextLine(); // input for playerType search
        String matchTypeSearch = sc.nextLine(); // input for matchType search

        // Find the player with the lowest runs for the given playerType
        int minimumRun = findPlayerWithLowestRuns(players, playertypesearch);
        if (minimumRun > 0) {
            System.out.println(minimumRun);
        } else {
            System.out.println("No such player");
        }

        // Find players by match type
        Player[] resultPlayers = findPlayerByMatchType(players, matchTypeSearch);
        if (resultPlayers != null) {
            for (Player player : resultPlayers) {
                System.out.println(player.getPlayerid());
            }
        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }

    // Method to find the player with the lowest runs for a given playerType
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRun = Integer.MAX_VALUE; // Initialize to a large value
        boolean found = false;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getplayerType().equalsIgnoreCase(playerType)) {
                if (players[i].getruns() < minRun) {
                    minRun = players[i].getruns();
                    found = true;
                }
            }
        }

        return found ? minRun : 0; // Return 0 if no player was found
    }

    // Method to find players by matchType and sort them by playerId in descending order
    public static Player[] findPlayerByMatchType(Player[] players, String matchType) {
        List<Player> matchingPlayers = new ArrayList<>();
        for (int i = 0; i < players.length; i++) {
            if (players[i].getmatchType().equalsIgnoreCase(matchType)) {
                matchingPlayers.add(players[i]);
            }
        }

        if (matchingPlayers.isEmpty()) {
            return null; // Return null if no players found
        }

        // Sort the players by playerId in descending order
        matchingPlayers.sort((p1, p2) -> p2.getPlayerid() - p1.getPlayerid());

        // Convert the List to an array and return
        return matchingPlayers.toArray(new Player[0]);
    }
}
