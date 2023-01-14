import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Squad[] squads = new Squad[32];

    // --------------------- MAIN ---------------------
    public static void main(String[] args){
        
        // Create the squads with ony the manager data
        for(int i = 0; i < 32; i++){
            // Read in the data from the Managers.csv file to the personData and managerData ArrayList
            try {
                Scanner scanner = new Scanner(new File("Managers.csv"));
                scanner.nextLine();  // Skip the first line with headers
                int counter = 0; // Counter to keep track of the index of the manager
                while (scanner.hasNextLine()) {
                    String[] data = scanner.nextLine().split(",");
                    // Create a new squad with the manager
                    squads[counter] = new Squad(data[2], new Manager(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), Double.parseDouble(data[5]), Double.parseDouble(data[6]), Double.parseDouble(data[7])));
                    counter++;
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Read Players.csv and add the players to the squad with the same team name
        try {
            Scanner scanner = new Scanner(new File("Players.csv"));
            scanner.nextLine();  // Skip the first line with headers
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                for(Squad s: squads){
                    if(s.getTeamName().equals(data[2])){
                        s.addPlayer(new Player(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), Double.parseDouble(data[5]), Double.parseDouble(data[6]), Double.parseDouble(data[7]), Double.parseDouble(data[8]), Double.parseDouble(data[9]), Double.parseDouble(data[10]), Double.parseDouble(data[11]), Double.parseDouble(data[12]), Double.parseDouble(data[13])));
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // Print out the squads
        for(Squad s: squads){
            System.out.println(s.getTeamName());
            System.out.println(s.getManager().getFirstName() + " " + s.getManager().getSurname());
            for (int i = 0; i < 5; i++) {
                System.out.println("Players:" + s.getPlayer(i).getFirstName());
            }
            System.out.println();
        }
            System.out.println();
    }

    public static Team getTeam(Squad s){
        Team t = new Team(s.getTeamName(), s.getManager());

        return t;
    }

    public static void runTournament(){

    }
}