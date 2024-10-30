package ipaQuestion;

import java.util.Arrays;
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
    public int getPlayerId() {
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

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];

        // Input player details
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
        String playerTypeSearch = sc.nextLine(); // input for playerType search
        String matchTypeSearch = sc.nextLine(); // input for matchType search

        // Find the player with the lowest runs for the given playerType
        int minimumRun = findPlayerWithLowestRuns(players, playerTypeSearch);
        if (minimumRun > 0) {
            System.out.println(minimumRun);
        } else {
            System.out.println("No such player");
        }

        // Find players by match type and print their IDs
        Player[] answer2 = findPlayerByMatchType(players, matchTypeSearch);
        if (answer2 == null) {
            System.out.println("No player with given match type");
        } else {
            for (int i = 0; i < answer2.length; i++) {
                System.out.println(answer2[i].getPlayerId());
            }
        }

        sc.close();
    }

    // Method to find the player with the lowest runs for a given playerType
    public static int findPlayerWithLowestRuns(Player[] players, String playerType) {
        int minRun = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getPlayerType().equalsIgnoreCase(playerType)) {
                if (players[i].getRuns() < minRun) {
                    minRun = players[i].getRuns();
                    found = true;
                }
            }
        }

        return found ? minRun : 0; // Return 0 if no player was found
    }

    // Method to find players by matchType and return sorted player IDs in descending order
    public static Player[] findPlayerByMatchType(Player[] players, String matchTypeSearch) {
        Player[] ans = new Player[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchType().equalsIgnoreCase(matchTypeSearch)) {
                ans = Arrays.copyOf(ans, ans.length + 1);
                ans[ans.length - 1] = players[i];
            }
        }

        Arrays.sort(ans, (a, b) -> Integer.compare(b.getPlayerId(), a.getPlayerId())); // Sort in descending order of playerId

        return ans.length == 0 ? null : ans;
    }
}
