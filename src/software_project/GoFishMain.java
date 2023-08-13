/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package software_project;

/**
 *
 * @author Prabhpreet Kaur,2023
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GoFishMain {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Go Fish!");
            
            int numPlayers;
            do {
                System.out.print("Enter the number of players (must be greater than or equal to 2): ");
                numPlayers = scanner.nextInt();
                if (numPlayers < 2) {
                    System.out.println("Number of players must be at least 2. Please try again.");
                }
            } while (numPlayers < 2);
            
            ArrayList<GoFishPlayer> players = new ArrayList<>();
            for (int i = 1; i <= numPlayers; i++) {
                System.out.print("Enter player " + i + "'s name: ");
                String playerName = scanner.next();
                players.add(new GoFishPlayer(playerName));
            }
            
            GoFishGame game = new GoFishGame("Go Fish");
            game.setPlayers(players);
            
            game.play();
        }
    }
}

