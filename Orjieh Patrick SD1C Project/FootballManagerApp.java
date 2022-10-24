/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orjieh_patrick_sd1c_project2;

import java.util.*;
import java.io.*;

/**
 *
 * @author orjie
 */
public class FootballManagerApp {

    public static void main(String[] args)throws IOException {

        System.out.println("=========================WELCOME TO FOOTBALL MANAGER 2022======================");
        
        Scanner keyboard = new Scanner(System.in);
        
//        System.out.println("Please input Manager Name: ");
//        String manager = keyboard.nextLine();
//        System.out.println("What is the name of Your Football Team: ");
//        String name = keyboard.nextLine();
//        System.out.println("What is the location of the team: ");
//        String location = keyboard.nextLine();
//
//        Team newUser = new Team(name, location, manager);
////        System.out.println(newUser);
//        System.out.println();
//        System.out.println("*****Create The Player Profile for your New Team with a maximum of 200€m for all 11 players*****");
//        
//        
//        String namep = "";
//        String dateOfBirth = "";
//        int shirtNo = 0;
//        String position = "";
//        String foot = "";
//        double height = 0.0;
//        double weight = 0.0;
//        String nationality = "";
//        double marketValue = 0;
//            for (int i = 1; i <= 2; i++) {
//
//                System.out.println("Profile for Player " + i);
//                System.out.println("Please input Player Name: ");
//                namep = keyboard.nextLine();
//                System.out.println("Please input Player Date Of Birth: ");
//                dateOfBirth = keyboard.nextLine();
//                System.out.println("Please input Player Nationality: ");
//                nationality = keyboard.nextLine();
//                System.out.println("Please input Player position: ");
//                position = keyboard.nextLine();
//                System.out.println("Please input Player Preferred Foot: ");
//                foot = keyboard.nextLine();
//                System.out.println("Please input Player Jersey Number: ");
//                shirtNo = keyboard.nextInt();
//                System.out.println("Please input Player Height: ");
//                height = keyboard.nextDouble();
//                System.out.println("Please input Player Weight: ");
//                weight = keyboard.nextDouble();
//                System.out.println("Please input Player MarketValue: ");
//                marketValue = keyboard.nextDouble();
//                
//                keyboard.nextLine();
//                
//                newUser.addPlayer(new Player(namep,dateOfBirth,shirtNo,position,foot,height,weight,nationality,marketValue));
//
//            }
//            
//            newUser.displayPlayers();

        System.out.println("Done");
        
        
       
        
        
        File inputFile = new File("teams.txt");

        Scanner input = new Scanner(inputFile);
        
        String nameOther = "";
        String playerOther = "";
         Team opponent = new Team();
         
         System.out.println("Below Are the list of Teams in the League");
         
        while (input.hasNext()) {
          
                 opponent = new Team(nameOther);
                 
            nameOther = input.nextLine();
            
           //System.out.println(nameOther);
            
           
            
            for (int j = 0; j < 11; j++) {
                
                playerOther = input.nextLine();
               // System.out.println(playerOther);
                opponent.addPlayer(new Player(playerOther));
                
            }
            
            //System.out.println(opponent);
           
            
            System.out.println(nameOther);

        }
        
         
        
        
    }
    
    public static void printGameMenu()
    {
        System.out.println("ATTENTION NEEDED");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }
    
   
}
