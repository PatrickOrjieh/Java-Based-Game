/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orjieh_patrick_sd1c_project2;
import java.util.*;
//import static orjieh_patrick_sd1c_project2.Team.*;
/**
 *
 * @author orjie
 */
public class testPlace {
    
    public static void main(String[] args) {
        
        // declaring objects using some constructors for Player class
        Player player1 = new Player("Patrick", "26 Sep", 7,"Forward","left",173.0,59.75,"Nigerian",70);
        Player player2 = new Player("Michael",2);
        Player player3 = new Player("Goalkeeper",12,"Right");
        Player player4 = new Player(5,91);
        Player player5 = new Player("Tega");
        Player player6 = new Player();
        
        //testing all getters for Player class
        System.out.println("Player1 has the following details: (Name:" + player1.getNamep()+ ", Date Of Birth: " + player1.getDateOfBirth() + ", Shirt Number: "
                           + player1.getShirtNo() + ", Position:  " + player1.getPosition() + ", Preferred Foot:  " + player1.getFoot() + ", Height:  " + player1.getHeight()
                           + ", Width: " + player1.getWeight() + ", Nationality: " + player1.getNationality() + ", MarketValue: " + player1.getMarketValue());
        
        System.out.println("Player2 has the following details: (Name:" + player2.getNamep()+ ", Date Of Birth: " + player2.getDateOfBirth() + ", Shirt Number: "
                           + player2.getShirtNo() + ", Position:  " + player2.getPosition() + ", Preferred Foot:  " + player2.getFoot() + ", Height:  " + player2.getHeight()
                           + ", Width: " + player2.getWeight() + ", Nationality: " + player2.getNationality() + ", MarketValue: " + player2.getMarketValue());
        
        System.out.println("Player3 has the following details: (Name:" + player3.getNamep()+ ", Date Of Birth: " + player3.getDateOfBirth() + ", Shirt Number: "
                           + player3.getShirtNo() + ", Position:  " + player3.getPosition() + ", Preferred Foot:  " + player3.getFoot() + ", Height:  " + player3.getHeight()
                           + ", Width: " + player3.getWeight() + ", Nationality: " + player3.getNationality() + ", MarketValue: " + player3.getMarketValue());
        
        System.out.println("Player4 has the following details: (Name:" + player4.getNamep()+ ", Date Of Birth: " + player4.getDateOfBirth() + ", Shirt Number: "
                           + player4.getShirtNo() + ", Position:  " + player4.getPosition() + ", Preferred Foot:  " + player4.getFoot() + ", Height:  " + player4.getHeight()
                           + ", Width: " + player4.getWeight() + ", Nationality: " + player4.getNationality() + ", MarketValue: " + player4.getMarketValue());
        
        System.out.println("Player5 has the following details: (Name:" + player5.getNamep()+ ", Date Of Birth: " + player5.getDateOfBirth() + ", Shirt Number: "
                           + player5.getShirtNo() + ", Position:  " + player5.getPosition() + ", Preferred Foot:  " + player5.getFoot() + ", Height:  " + player5.getHeight()
                           + ", Width: " + player5.getWeight() + ", Nationality: " + player5.getNationality() + ", MarketValue: " + player5.getMarketValue());
        
        System.out.println("Player6 has the following details: (Name:" + player6.getNamep()+ ", Date Of Birth: " + player6.getDateOfBirth() + ", Shirt Number: "
                           + player6.getShirtNo() + ", Position:  " + player6.getPosition() + ", Preferred Foot:  " + player6.getFoot() + ", Height:  " + player6.getHeight()
                           + ", Width: " + player6.getWeight() + ", Nationality: " + player6.getNationality() + ", MarketValue: " + player6.getMarketValue());
        
        System.out.println();
        System.out.println();
        
        //testing the toString Method for Player class
        System.out.println("Testing toString: " + player1);
        System.out.println("Testing toString: " + player2);
        System.out.println("Testing toString: " + player3);
        System.out.println("Testing toString: " + player4);
        System.out.println("Testing toString: " + player5);
        System.out.println("Testing toString: " + player6);
        
        System.out.println();
        System.out.println();
        
        //testing setter for Player class
        player1.setNamep("KELVIN");
        System.out.println("New player name for player1 is now "+player1.getNamep());
        System.out.println("Testing the toString method - Player 1: "+player1);
        
        
        //testing the equals method for Player class
        Player player7 = new Player("patrick", "26 Sep", 7,"Forward","left",173.0,59.75,"Nigerian",70);
        System.out.println("Player1 equals Player7: "+player1.equals(player7));// expected false
        
        Player player8 = new Player("KELVIN", "26 Sep", 7,"Forward","left",173.0,59.75,"Nigerian",70);
        System.out.println("Player1 equals Player8: "+player1.equals(player8));//expected true
        
        
        // declaring objects using constructor for team class
        ArrayList<Player> arrayList_players = new ArrayList<>();
        arrayList_players.add(player1);
        arrayList_players.add(player2);
        arrayList_players.add(player3);
        arrayList_players.add(player4);
        arrayList_players.add(player5);
        arrayList_players.add(player6);
        
        Team team1 = new Team("Arsenal", "North London", "Arteta", 6, 700,arrayList_players);
        
        //testing getters for team1
        System.out.println("Team1 has the following: (Name: " + team1.getName()+ ", Location: " + team1.getLocation() + ", Manager: " + team1.getManager()
                           + ", Ranking: " + team1.getRanking() + ", value: " + team1.getValue() + ", Players: " + team1.getPlayers() );
        
        //testing setter for the team class
        team1.setName("Liverpool");
        System.out.println("New team name for team1 is now "+team1.getName());
        
        //testing toString method
        System.out.println("Testing the toString method - team1: "+team1);
        
        //testing method to add players
        Team team2 = new Team("Madrid");
        team2.addPlayer(new Player(""));
        
        //testing display players method
       // team1.displayPlayersDetails();
        
        //testing the delete method
        //team1.deleteAllPlayers();
        
        //testing getHighestMarketValue
        team1.getHighestMarketValue();
        
        //testing the findByPlayersName()
        //team1.findByPlayerNamep();
        
        //testing the findByPlayerPosition()
        //team1.findByPlayerPosition();
        
        //testing method countByPreferredFoot()
        //team1.countPlayersByPreferredFoot();
        
        
        //testing the deleteByOlayerDetail method
        //team1.deleteByPlayersName();
        
        //testing the sort method
        //team1.sortByMarketValue();
        
    }
    
}
