package ipaQuestion;

import java.util.Scanner;

class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    // constructor 
    public Player(int playerId,String playerName,int runs ,
     String playerType, String matchType ){
        this.playerId = playerId;
        this.playerName=playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
     }

    // getter and setter
    public void setPlayerId(int playerId){
      this.playerId = playerId;
    }
    public int getPlayerid(){
        return playerId;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setruns(int runs){
        this.runs = runs;
    }
    public int getruns(){
        return runs;
    }
    public void setPlayertype(String playerType){
        this.playerType = playerType;
    }
    public String getplayerType(){
        return playerType;
    }
    public void setmatchType(String matchType){
        this.matchType = matchType;
    }
    public String getmatchType(){
        return matchType;
    }
}

public class MyClass{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Player [] players = new Player[4];
        for(int i =0;i<4;i++){
            int playerId = sc.nextInt();
            sc.nextLine();
            String playerName = sc.nextLine();
            int runs = sc.nextInt();
            sc.nextLine();
            String playerType = sc.nextLine();
            String matchType = sc.nextLine();
            players[i] = new Player(playerId, playerName, runs, playerType, matchType);
        }
        sc.nextLine();
        String playertypesearch =sc.nextLine();
        // String matchTypeSearch = sc.nextLine();

        int minimumrun = findPlayerWithLowestRuns(players, playertypesearch);
        if(minimumrun>0){
            System.out.println(minimumrun);
        }
        else{
            System.out.println("no run found");
        }
       sc.close();
    }
    
    public static int findPlayerWithLowestRuns(Player[] players,String playerType){
        // int minRun =0;
        int ans =0;
        for(int i =0;i<players.length;i++){
         if(players[i].getplayerType() == playerType){
             ans = players[i].getruns();
         }
        }
        return ans;
     }
}