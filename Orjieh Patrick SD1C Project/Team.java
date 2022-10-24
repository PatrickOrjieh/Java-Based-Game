/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orjieh_patrick_sd1c_project2;

import java.util.*;
/**
 *
 * @author orjie
 */
public class Team {
    
    Scanner keyboard = new Scanner(System.in);
    
    //Attributes for each team
    private String name;
    private String location;
    private String manager;
    private int ranking;
    private double value;
    private ArrayList<Player> players;
    
    //Constructors

    /**
     *
     * @param name
     * @param location
     * @param manager
     * @param ranking
     * @param value
     * @param players
     */
    public Team (String name, String location, String manager, int ranking, double value, ArrayList<Player> players){
        
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.ranking = ranking;
        this.value = value;
        this.players = players;
    }
    
    /**
     *
     * @param name
     * @param location
     * @param manager
     * @param ranking
     * @param value
     */
    public Team (String name, String location, String manager, int ranking, double value){
        
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.ranking = ranking;
        this.value = value;
        this.players = new ArrayList();
    }
    
    /**
     *
     * @param name
     * @param location
     * @param manager
     */
    public Team (String name, String location, String manager){
        
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.ranking = -1;
        this.value = -1;
        this.players = new ArrayList();
    }
    
    /**
     *
     * @param name
     * @param value
     */
    public Team (String name,double value){
        
        this.name = name;
        this.location = null;
        this.manager = null;
        this.ranking = -1;
        this.value = value;
        this.players = new ArrayList();
    }
    
    /**
     *
     * @param name
     */
    public Team (String name){
        
        this.name = name;
        this.location = null;
        this.manager = null;
        this.ranking = -1;
        this.value = -1;
        this.players = new ArrayList();
    }
    
    /**
     *
     * @param name
     * @param players
     */
    public Team (String name,ArrayList<Player> players){
        
        this.name = name;
        this.location = null;
        this.manager = null;
        this.ranking = -1;
        this.value = -1;
        this.players = players;
    }
    
    //no argument constructor

    /**
     *
     */
    public Team (){
        
        this.name = null;
        this.location = null;
        this.manager = null;
        this.ranking = -1;
        this.value = -1;
        this.players = new ArrayList();
    }
    
    //getters

    /**
     *gets the name of the team
     * @return the name of the team
     */
    public String getName(){
        
        return this.name;
    }
    
    /**
     *gets the location of the team
     * @return the location of the team
     */
    public String getLocation(){
        
        return this.location;
    }
    
    /**
     *gets the manager of the team
     * @return the manager of the team
     */
    public String getManager(){
        
        return this.manager;
    }
    
    /**
     *gets the ranking of the team
     * @return the ranking of the team
     */
    public int getRanking(){
        
        return this.ranking;
    }
    
    /**
     *gets the value of the team
     * @return the value of the team
     */
    public double getValue(){
        
        return this.value;
    } 
    
    /**
     *gets the players in the team
     * @return the players of the team
     */
    public ArrayList getPlayers(){
        
        return this.players;
    }
    
    //setters

    /**
     *changes the name of the team
     * @param name new name for the team
     */
    public void setName(String name){
        
        this.name = name;
    }
    
    /**
     *changes the location of the team
     * @param location new location of the team
     */
    public void setLocation(String location){
        
        this.location = location;
    }
    
    /**
     * changes the manager of the team
     * @param manager new manager of the team
     */
    public void setManager(String manager){
        
        this.manager = manager;
    }
    
    /**
     *changes the ranking of the team
     * @param ranking new ranking of the team
     */
    public void setRanking(int ranking){
        
        this.ranking = ranking;
    }
    
    /**
     *changes the value of the team
     * @param value new value for the team
     */
    public void setValue(double value){
        
        this.value = value;
    }
    
    /**
     * changes the players in the team
     * @param players new players in the team
     */
    public void setPlayers(ArrayList players){
        
        this.players = players;
    }
    
    //toString

    /**
     * the default string form of the team object
     * @return
     */
    public String toString(){
        return "Team Name: " + name + ", Location: " + location + ", Manager Of The Team: " + manager + ", Team Ranking: " + ranking + ", Value: "
                + value +", Players: " + players;
    }
    
    //method to add new players

    /**
     *adds player to the team object
     * @param p
     */
    public void addPlayer(Player p)
    {

        players.add(p);

    }
    
    //method to display players for different teams

    /**
     *displays the players with full attributes
     */
    public void displayPlayersDetails()
    {
        System.out.println();
        System.out.println("Displaying  Players for: " + name);
        
        for (int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i));
        }

    }
    
    //method to only display players names

    /**
     *method to display only players names
     */
     public void displayPlayersNames()
    {
        System.out.println();
        System.out.println("Displaying  Players Names for: " + name);
        
        for (int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i).getNamep());
        }

    }
    
    //method to delete  players by name

    /**
     *method that deletes the players from the team using the names alone
     */
    public void deleteByPlayersName()
    {
        System.out.println("Enter Players Name that you want to be deleted: ");
        String delete = keyboard.nextLine();
        
        for (Player player : players) {
            if (player.getNamep().equals(delete)) {
                
                players.remove(player);
            }else
            {
                System.out.println("Player not available");
            }
        }
    }
    
    /**
     *method to delete all players in the team
     */
    public void deleteAllPlayers()
    {
     
        players.clear();
    }
    
    //to find player with the jighest market value or cost

    /**
     *method to get the most valuable player in the team
     * @return
     */
     public double getHighestMarketValue()
    {
        double highest_marketValue = 0;
        Collections.sort(this.players);
        
        int playersNum = this.players.size();
        Player ok = this.players.get(playersNum-1);
        System.out.println(ok);
        highest_marketValue = ok.getMarketValue();
        return highest_marketValue;
    }
     
     //method to find players by searching their names

    /**
     *method to search for a player in a team using the name of the player to find
     */
     public void findByPlayerNamep()
     {
         System.out.println("Please Input Player'S Name: ");
         String searchName =keyboard.nextLine();
        for (Player player : players) {
            if (player.getNamep().equalsIgnoreCase(searchName)) {
                
                System.out.println(player);
            }
        }
         
     }
     
      //method to find players by searching their names

    /**
     *method to search for players with a particular position
     */
     public void findByPlayerPosition()
     {
         System.out.println("Please Input Player'S Position: ");
         String searchPosition =keyboard.nextLine();
        for (Player player : players) {
            if (player.getPosition().equalsIgnoreCase(searchPosition)) {
                
                System.out.println(player);
            }
        }
         
     }
     
     //method to count Players that use a particular foot often

    /**
     *method to count players with  a particular preferred foot
     */
     public void countPlayersByPreferredFoot()
     {
         System.out.println("Input the preferred foot you would like to see the amount of players: ");
         String foot = keyboard.nextLine();
         int count = 0;
         for (Player player : players) {
             
             if (player.getFoot().equalsIgnoreCase(foot)) {
                 
                 count++;
             }
         }
         System.out.println("Number of Players with "+ foot +" is/are " + count);
         
     }
     
//     public  void findPlayerByName(String l, ArrayList<Player> other){
//         
//        int indexfind = other.indexOf("Patrick");
//        
//         if (indexfind == -1) {
//             System.out.println("Sorry that player doesn't Exist");
//             
//         }
//         else{
//             System.out.println("Player: "+ l + "EXISTS in the system");
//         }
//    
//     }
      
     //method to sort by Players MarketValue

    /**
     *method to sort players in a team with reference to the marketValue
     */
     public void sortByMarketValue()
     {
         Collections.sort(players);
         
         System.out.println("Displaying Players Sorted According to their MarketValue");
         
         for (int i = 0; i < players.size(); i++)
        {
            System.out.println(players.get(i));
        }
     }
    
    
    
    
}
