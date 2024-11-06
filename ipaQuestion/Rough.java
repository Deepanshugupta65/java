package ipaQuestion;

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

    // Getters
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

        // Input player details
        for (int i = 0; i < 4; i++) {
            int playerId = sc.nextInt();
            sc.nextLine(); // consume newline
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine(); // consume newline
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }

        String playerTypeSearch = sc.nextLine(); // input for playerType search
        String matchTypeSearch = sc.nextLine(); // input for matchType search

        // Find the player with the lowest runs for the given playerType
        int minimumRun = findPlayerWithLowestRuns(players, playerTypeSearch);
        if (minimumRun > 0) {
            System.out.println(minimumRun);
        } else {
            System.out.println("No such player");
        }

        // Find players by matchType and print their IDs in descending order
        sortPlayersByDescendingId(players);
        for (Player player : players) {
            if (player.getMatchType().equalsIgnoreCase(matchTypeSearch)) {
                System.out.println(player.getPlayerId());
            }
        }

        sc.close();
    }

    // Method to find the player with the lowest runs for a given playerType
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRun = Integer.MAX_VALUE;
        boolean found = false;

        for (Player player : players) {
            if (player.getPlayerType().equalsIgnoreCase(playerType)) {
                if (player.getRuns() < minRun) {
                    minRun = player.getRuns();
                    found = true;
                }
            }
        }

        return found ? minRun : 0; // Return 0 if no player was found
    }

    // Method to sort players by playerId in descending order
    public static Player[] sortPlayersByDescendingId(Player[] players) {
        int n = players.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (players[i].getPlayerId() < players[j].getPlayerId()) {
                    Player temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
        return players;
    }
}
