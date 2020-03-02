package videoPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {

    static Scanner scanner = new Scanner(System.in);
    static List<Team> teams = new ArrayList<Team>();

    public static void main(String[] args) {

        int decision = 0;

        while (true) {

            printOptions();
            decision = scanner.nextInt();
            if (decision == 1) {
                teams.add(createNewTeam());
            } else if (decision == 2) {
                addPlayerToTeam();
            } else if (decision == 3) {
                removePlayerFromTeam();
            } else if (decision == 4) {
                describeTeam();
            } else {
                System.out.println("Please pick a valid option!");
            }
        }
    }

    private static void printOptions() {
        System.out.println("1) Create New Team");
        System.out.println("2) Add New Player to Team");
        System.out.println("3) Remove Player from Team");
        System.out.println("4) View Team Info");
    }

    private static void describeTeam() {
        System.out.println("Which team would you like info for? ");
        printTeamNames();
        String teamName = scanner.next();
        try {
            Team foundTeam = findTeamByName(teamName);
            foundTeam.describe();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static Team createNewTeam() {
        System.out.print("Enter name of the new team: ");
        String name = scanner.next();
        return new Team(name);
    }

    private static void addPlayerToTeam() {
        printTeamNames();
        System.out.println("Enter name team you wish to add player to: ");
        String teamName = scanner.next();
        try {
            Team foundTeam = findTeamByName(teamName);
            foundTeam.addPlayer(createNewPlayer());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static void removePlayerFromTeam() {
        printTeamNames();
        System.out.println("Enter name of team you wish to remove player from: ");
        String teamName = scanner.next();
        try {
            Team foundTeam = findTeamByName(teamName);
            foundTeam.describe();
            System.out.println("Which player would you liek to remove? ");
            String playerName = scanner.next();
            foundTeam.removePlayer(playerName);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private static Player createNewPlayer() {
        System.out.println("Enter player name: ");
        String name = scanner.next();
        System.out.println("Enter player position: ");
        String position = scanner.next();
        System.out.println("Enter player specialty: ");
        String specialty = scanner.next();
        return new Player(name, position, specialty);
    }

    private static void printTeamNames() {
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }

    private static Team findTeamByName(String name) throws Exception{
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        throw new Exception("Team Not Found: " + name);
    }

}
