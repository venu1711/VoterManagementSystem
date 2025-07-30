package console;

import controller.CandidateController;
import model.Candidate;

import java.sql.SQLException;
import java.util.Scanner;

public class CandidateConsole {
    Scanner sc = new Scanner(System.in);
    CandidateController candidateController = new CandidateController();
    public static void handleCandidate() throws SQLException {
        System.out.println("--------- Candidate options ----------");
        System.out.println("1. Register Candidate");
        System.out.println("2. Get no of votes on the party");
        System.out.print("Option: ");
        int option = sc.nextInt();
        if(option == 1){
            try{
                System.out.print("Party ID:");
                int id = sc.nextInt();
                System.out.print("Candidate Name: ");
                String name = sc.nextLine();
                Candidate c = new Candidate(id,name,0);
                candidateController.register(c);
                System.out.println("Registered");
            }catch(SQLException e){
                if(e.getMessage().contains("Duplicate Entry") || e.getErrorCode() == 1062){
                    System.out.println("Party ID already exists");
                }else{
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }else if(option == 2){
            System.out.print("Candidate Name: ");
            String name = sc.nextLine();
            int votes = candidateController.getVotes(name);
            System.out.println("Candidate " + name + " got " + votes + "votes");
        }

    }
}
