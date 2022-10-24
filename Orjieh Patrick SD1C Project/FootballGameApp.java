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
public class FootballGameApp {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        //Initializing 5 teams to be used in the football managerr game
        Team Arsenal = new Team("Arsenal", "North London", "Arteta", 5, 172);

        Arsenal.addPlayer(new Player("Ramsdale", "May 14, 1998", 32, "Goalkeeper", "right", 190, 77, "England", 22.50));
        Arsenal.addPlayer(new Player("Ben", "Sep 9, 2001", 4, "Defender", "right", 186, 79, "England", 36.00));
        Arsenal.addPlayer(new Player("Bukayo", "Sep 5, 2001", 7, "Midfielder", "left", 178, 63, "England", 58.50));
        Arsenal.addPlayer(new Player("Pepe", "May 29, 1995", 19, "Forward", "left", 183, 71, "Ivory Coast", 27.00));
        Arsenal.addPlayer(new Player("Gabriel", "Jun 18, 2001", 35, "Forward", "right", 176, 65, "Brazil", 34.20));

        Team Chelsea = new Team("Chelsea", "London", "Thomas", 3, 274);

        Chelsea.addPlayer(new Player("Mendy", "Aug 3, 1996", 13, "Goalkeeper", "right", 200, 80, "Senegal", 44.00));
        Chelsea.addPlayer(new Player("Rudiger", "Mar 19, 1997", 2, "Defender", "left", 199, 83, "Germany", 31.75));
        Chelsea.addPlayer(new Player("Mount", "Dec 5, 2002", 19, "Midfielder", "right", 178, 67, "England", 47.81));
        Chelsea.addPlayer(new Player("Werner", "Oct 29, 1999", 10, "Forward", "left", 196.9, 78, "Germany", 78.90));
        Chelsea.addPlayer(new Player("Lukaku", "Feb 27, 1994", 9, "Forward", "right", 189, 90, "Belguim", 57.42));

        Team ManCity = new Team("Manchester City", "Manchester", "Pep", 1, 400);

        ManCity.addPlayer(new Player("Ederson", "Jun 7, 1996", 36, "Goalkeeper", "right", 189, 75, "Brazil", 47.89));
        ManCity.addPlayer(new Player("Rodri", "Sep 9, 1998", 2, "Defender", "right", 187, 68, "Brazil", 29.45));
        ManCity.addPlayer(new Player("Bernando", "Jul 26, 1997", 10, "Midfielder", "left", 173, 63, "Portugal", 67.63));
        ManCity.addPlayer(new Player("Mahrez", "May 16, 1995", 26, "Forward", "left", 175, 67, "Algeria", 72.00));
        ManCity.addPlayer(new Player("Kevin", "Apr 20, 1997", 12, "Forward", "right", 187, 78, "Belgium", 86));

        Team Liverpool = new Team("LiverPool", "liverpool", "Kloop", 2, 351);

        Liverpool.addPlayer(new Player("Allison", "Nov 1, 1997", 1, "Goalkeeper", "right", 187, 78, "Brazil", 46.59));
        Liverpool.addPlayer(new Player("Virgil", "Jan 9, 1998", 4, "Defender", "right", 198, 89, "Netherlands", 58.95));
        Liverpool.addPlayer(new Player("Keita", "Aug 5, 1990", 8, "Midfielder", "right", 178, 63, "Guinea", 55));
        Liverpool.addPlayer(new Player("Salah", "Feb 29, 1995", 11, "Forward", "left", 183, 71, "Egypt", 90.54));
        Liverpool.addPlayer(new Player("Mane", "Sep 18, 1994", 10, "Forward", "right", 182, 77, "Senegal", 89));

        Team ManUtd = new Team("Manhester United", "Manchester", "Eric", 7, 339);

        ManUtd.addPlayer(new Player("David", "Feb 14, 1996", 1, "Goalkeeper", "right", 190, 78, "Spain", 45.68));
        ManUtd.addPlayer(new Player("Luke", "Sep 9, 1997", 3, "Defender", "left", 176, 84, "England", 36.00));
        ManUtd.addPlayer(new Player("Bruno", "Jun 17, 1995", 18, "Midfielder", "right", 178, 69, "Portugal", 87.00));
        ManUtd.addPlayer(new Player("Cavani", "Aug 29, 1990", 21, "Forward", "right", 189, 81, "Uruguay", 59.47));
        ManUtd.addPlayer(new Player("Ronaldo", "Feb 5, 1985", 7, "Forward", "Both", 190, 77, "Portugal", 86.90));

        System.out.println("=========================WELCOME TO FOOTBALL MANAGER 2022======================");
        printMenu();
        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println("Please choose your option: ");
        option = keyboard.nextInt();

        Random rand = new Random();

        while (option != 4) {
            if (option == 1) {

                System.out.println("=========   CAREER MODE     =======");
                System.out.println("Below Create Own Team And Player");
                System.out.println("Please input Manager Name: ");
                String manager = keyboard.next();
                System.out.println("What is the name of Your Football Team: ");
                String name = keyboard.next();
                System.out.println("What is the location of the team: ");
                String location = keyboard.next();
                System.out.println("What is the ranking of the team: ");
                int ranking = keyboard.nextInt();
                System.out.println("What is the Value of the team: ");
                double value = keyboard.nextDouble();

                Team newUser = new Team(name, location, manager, ranking, value);

                System.out.println();
                System.out.println("*****Create The Player Profile for your New Team*****");

                String namep = "";
                String dateOfBirth = "";
                int shirtNo = 0;
                String position = "";
                String foot = "";
                double height = 0.0;
                double weight = 0.0;
                String nationality = "";
                double marketValue = 0;
                for (int i = 1; i <= 2; i++) {

                    System.out.println("Profile for Player " + i);
                    System.out.println("Please input Player Name: ");
                    namep = keyboard.next();
                    System.out.println("Please input Player Date Of Birth: ");
                    dateOfBirth = keyboard.next();
                    System.out.println("Please input Player Nationality: ");
                    nationality = keyboard.next();
                    System.out.println("Please input Player position: ");
                    position = keyboard.next();
                    System.out.println("Please input Player Preferred Foot: ");
                    foot = keyboard.next();
                    System.out.println("Please input Player Jersey Number: ");
                    shirtNo = keyboard.nextInt();
                    System.out.println("Please input Player Height: ");
                    height = keyboard.nextDouble();
                    System.out.println("Please input Player Weight: ");
                    weight = keyboard.nextDouble();
                    System.out.println("Please input Player MarketValue: ");
                    marketValue = keyboard.nextDouble();

                    keyboard.nextLine();

                    newUser.addPlayer(new Player(namep, dateOfBirth, shirtNo, position, foot, height, weight, nationality, marketValue));

                }

                System.out.println("Press any key to continue");
                keyboard.next();

                int opponent = rand.nextInt(5) + 1;

                System.out.println("========GAME DAY===========");

                if (opponent == 1) {
                    System.out.println(newUser.getName() + "        vs        " + Arsenal.getName());
                    newUser.displayPlayersNames();
                    Arsenal.displayPlayersNames();
                    System.out.println("");

                    int score1 = rand.nextInt(4);
                    int score2 = rand.nextInt(4);
                    System.out.println("Scores:  " + newUser.getName() + " " + score1 + " - " + score2 + "  Arsenal");

                } else if (opponent == 2) {
                    System.out.println(newUser.getName() + "        vs        " + Chelsea.getName());
                    newUser.displayPlayersNames();
                    Chelsea.displayPlayersNames();
                    System.out.println("");

                    int score1 = rand.nextInt(4);
                    int score2 = rand.nextInt(4);
                    System.out.println("Scores:  " + newUser.getName() + " " + score1 + " - " + score2 + "  Chelsea");
                } else if (opponent == 3) {
                    System.out.println(newUser.getName() + "        vs        " + ManCity.getName());
                    newUser.displayPlayersNames();
                    ManCity.displayPlayersNames();
                    System.out.println("");

                    int score1 = rand.nextInt(4);
                    int score2 = rand.nextInt(4);
                    System.out.println("Scores:  " + newUser.getName() + " " + score1 + " - " + score2 + "  Manchester City");
                } else if (opponent == 4) {
                    System.out.println(newUser.getName() + "        vs        " + Liverpool.getName());
                    newUser.displayPlayersNames();
                    Liverpool.displayPlayersNames();
                    System.out.println("");

                    int score1 = rand.nextInt(4);
                    int score2 = rand.nextInt(4);
                    System.out.println("Scores:  " + newUser.getName() + " " + score1 + " - " + score2 + "  LiverPool");
                } else {
                    System.out.println(newUser.getName() + "        vs        " + ManUtd.getName());
                    newUser.displayPlayersNames();
                    ManUtd.displayPlayersNames();
                    System.out.println("");

                    int score1 = rand.nextInt(4);
                    int score2 = rand.nextInt(4);
                    System.out.println("Scores:  " + newUser.getName() + " " + score1 + " - " + score2 + "  Manchester United");
                }

                System.out.println("Press any key to continue");
                keyboard.next();

            } else if (option == 2) {
                System.out.println("Here, You can delete/find/count/sort and basically manipulate your data");
                System.out.println("Below are the teams you can manipulate: 'Arsenal','Chelsea','ManCity','Liverpool','ManUtd'");
                System.out.println("Input team: ");
                String select = keyboard.next();

                if (select.equalsIgnoreCase("Arsenal")) {
                    print2SubOption();

                    System.out.println("Enter Option: ");
                    int subOption = keyboard.nextInt();

                    if (subOption == 1) {
                        Arsenal.displayPlayersDetails();
                    } else if (subOption == 2) {
                        Arsenal.displayPlayersNames();
                    } else if (subOption == 3) {
                        Arsenal.deleteByPlayersName();
                        System.out.println(Arsenal);
                    } else if (subOption == 4) {
                        Arsenal.deleteAllPlayers();
                        System.out.println(Arsenal);
                    } else if (subOption == 5) {
                        Arsenal.getHighestMarketValue();
                    } else if (subOption == 6) {
                        Arsenal.findByPlayerNamep();
                    } else if (subOption == 7) {
                        Arsenal.findByPlayerPosition();
                    } else if (subOption == 8) {
                        Arsenal.countPlayersByPreferredFoot();
                    } else if (subOption == 9) {
                        Arsenal.sortByMarketValue();
                    } else {
                        System.out.println("Wrong Input");
                    }

                } else if (select.equalsIgnoreCase("Chelsea")) {
                    print2SubOption();

                    System.out.println("Enter Option: ");
                    int subOption = keyboard.nextInt();

                    if (subOption == 2) {
                        Chelsea.displayPlayersDetails();
                    } else if (subOption == 2) {
                        Chelsea.displayPlayersNames();
                    } else if (subOption == 3) {
                        Chelsea.deleteByPlayersName();
                        System.out.println(Chelsea);
                    } else if (subOption == 4) {
                        Chelsea.deleteAllPlayers();
                        System.out.println(Chelsea);
                    } else if (subOption == 5) {
                        Chelsea.getHighestMarketValue();
                    } else if (subOption == 6) {
                        Chelsea.findByPlayerNamep();
                    } else if (subOption == 7) {
                        Chelsea.findByPlayerPosition();
                    } else if (subOption == 8) {
                        Chelsea.countPlayersByPreferredFoot();
                    } else if (subOption == 9) {
                        Chelsea.sortByMarketValue();
                    } else {
                        System.out.println("Wrong Input");
                    }

                } else if (select.equalsIgnoreCase("ManCity")) {
                    print2SubOption();

                    System.out.println("Enter Option: ");
                    int subOption = keyboard.nextInt();

                    if (subOption == 3) {
                        ManCity.displayPlayersDetails();
                    } else if (subOption == 2) {
                        ManCity.displayPlayersNames();
                    } else if (subOption == 3) {
                        ManCity.deleteByPlayersName();
                        System.out.println(ManCity);
                    } else if (subOption == 4) {
                        ManCity.deleteAllPlayers();
                        System.out.println(ManCity);
                    } else if (subOption == 5) {
                        ManCity.getHighestMarketValue();
                    } else if (subOption == 6) {
                        ManCity.findByPlayerNamep();
                    } else if (subOption == 7) {
                        ManCity.findByPlayerPosition();
                    } else if (subOption == 8) {
                        ManCity.countPlayersByPreferredFoot();
                    } else if (subOption == 9) {
                        ManCity.sortByMarketValue();
                    } else {
                        System.out.println("Wrong Input");
                    }

                } else if (select.equalsIgnoreCase("Liverpool")) {
                    print2SubOption();

                    System.out.println("Enter Option: ");
                    int subOption = keyboard.nextInt();

                    if (subOption == 4) {
                        Liverpool.displayPlayersDetails();
                    } else if (subOption == 2) {
                        Liverpool.displayPlayersNames();
                    } else if (subOption == 3) {
                        Liverpool.deleteByPlayersName();
                        System.out.println(Liverpool);
                    } else if (subOption == 4) {
                        Liverpool.deleteAllPlayers();
                        System.out.println(Liverpool);
                    } else if (subOption == 5) {
                        Liverpool.getHighestMarketValue();
                    } else if (subOption == 6) {
                        Liverpool.findByPlayerNamep();
                    } else if (subOption == 7) {
                        Liverpool.findByPlayerPosition();
                    } else if (subOption == 8) {
                        Liverpool.countPlayersByPreferredFoot();
                    } else if (subOption == 9) {
                        Liverpool.sortByMarketValue();
                    } else {
                        System.out.println("Wrong Input");
                    }

                } else if (select.equalsIgnoreCase("ManUtd")) {
                    print2SubOption();

                    System.out.println("Enter Option: ");
                    int subOption = keyboard.nextInt();

                    if (subOption == 5) {
                        ManUtd.displayPlayersDetails();
                    } else if (subOption == 2) {
                        ManUtd.displayPlayersNames();
                    } else if (subOption == 3) {
                        ManUtd.deleteByPlayersName();
                        System.out.println(ManUtd);
                    } else if (subOption == 4) {
                        ManUtd.deleteAllPlayers();
                        System.out.println(ManUtd);
                    } else if (subOption == 5) {
                        ManUtd.getHighestMarketValue();
                    } else if (subOption == 6) {
                        ManUtd.findByPlayerNamep();
                    } else if (subOption == 7) {
                        ManUtd.findByPlayerPosition();
                    } else if (subOption == 8) {
                        ManUtd.countPlayersByPreferredFoot();
                    } else if (subOption == 9) {
                        ManUtd.sortByMarketValue();
                    } else {
                        System.out.println("Wrong Input");
                    }

                }
            } else if (option == 3) {

                File inputFile = new File("teams.txt");

                Scanner input = new Scanner(inputFile);

                String nameOther = "";
                String playerOther = "";
                Team opponent = new Team();

                System.out.println("Below Are the list of Teams in the League");
                System.out.println("");

                while (input.hasNext()) {

                    opponent = new Team(nameOther);

                    nameOther = input.nextLine();

                    System.out.println(nameOther + " has the following players: ");

                    System.out.println("");

                    for (int j = 0; j < 11; j++) {

                        playerOther = input.nextLine();
                        System.out.println(playerOther);
                        opponent.addPlayer(new Player(playerOther));

                    }
                    System.out.println("");

                }
            } else {
                System.out.println("Invalid number, please enter an option between 1 and 5");
            }
            printMenu();
            System.out.println("Please choose your option: ");
            option = keyboard.nextInt();

        }

        System.out.println("Thanks for Playing - Goodbye");

    }

    /**
     *prints initial menu for the user to select the main options
     */
    public static void printMenu() {
        System.out.println("Project Menu");
        System.out.println("1. Player Career Mode Football Manager");
        System.out.println("2. Delete/Find/Count/Sort");
        System.out.println("3. Read and Write Own Team");
        System.out.println("4. Exit");
    }

    /**
     *methods for the suboptions of main menu 2
     */
    public static void print2SubOption() {

        System.out.println("1. Display Player Details");
        System.out.println("2. Display Player's Names");
        System.out.println("3. Delete a player list using the name");
        System.out.println("4. Delete All Players From The Team");
        System.out.println("5. Get Player With The Highest Market Value");
        System.out.println("6. Find Player By Name");
        System.out.println("7. Find Player By Position");
        System.out.println("8. Count Players using the selected preferred foot");
        System.out.println("9. Sort Players By Market Value");
    }

}
