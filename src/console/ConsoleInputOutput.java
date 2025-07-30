package console;

import controller.CandidateController;
import model.Candidate;

import java.sql.SQLException;
import java.util.Scanner;


public class ConsoleInputOutput{
    CandidateController candidateController = new CandidateController();
    Scanner sc = new Scanner(System.in);

    public void start() throws SQLException {
        while(true){
            System.out.println("1. Admin");
            System.out.println("2. Candidate");
            System.out.println("3. Voter");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1 -> adminLogin();
                case 2 -> CandidateConsole.handleCandidate();
                case 3 -> voterPrivileges();
                case 4 ->{
                    System.out.println("Bye Bye");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
