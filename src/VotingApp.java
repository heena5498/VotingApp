import java.util.Scanner;

public class VotingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();

        System.out.println("Welcome to the Jenna's Voting Blockchain CLI System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cast vote");
            System.out.println("2. View blockchain");
            System.out.println("3. Check chain validity");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    boolean newVote = false;
                    System.out.print("Enter voter ID: ");
                    String voterId = scanner.nextLine();
                    System.out.print("Enter vote('yay' or 'nay'): ");
                    String userVote = scanner.nextLine();

                    if (userVote.equals("yay")) {
                        newVote = true;
                    }
                    else if (userVote.equals("nay")) {
                        newVote = false;
                    }

                    Vote vote = new Vote(voterId, newVote);
                    blockchain.addBlock(vote);
                    System.out.println("Vote has been added to the blockchain!");

                    break;
                case "2":
                    blockchain.printChain();
                    break;
                case "3":
                    boolean isValid = blockchain.isChainValid();
                    System.out.println("The blokchain is " + (isValid ? "Valid blockchain!" : "INVALID blockchain!"));
                case "4":
                    System.out.println("Exiting voting system, Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please enter a number 1-4.");

            }
        }
    }
}
