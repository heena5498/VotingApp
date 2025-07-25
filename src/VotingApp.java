import java.util.Scanner;

public class VotingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blockchain blockchain = new Blockchain();

        System.out.println("Welcome to Jenna's Voting Blockchain CLI System!");
        System.out.println("************************************************");

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Cast vote");
            System.out.println("2. View blockchain");
            System.out.println("3. Check chain validity");
            System.out.println("4. Exit");
            System.out.println("************************************************");
            System.out.print("Choose option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Please enter your first name: ");
                    String voterFirstName = scanner.nextLine();

                    System.out.print("Please enter your last name: ");
                    String voterLastName = scanner.nextLine();

                    VoteTopic.getTopics();
                    System.out.println("---------------------------");
                    System.out.print("Choose a topic to vote on: (1-5)");
                    int votersTopic = scanner.nextInt();
                    scanner.nextLine();

                    String voterId = VoterId.getVoterId(voterFirstName, voterLastName);

                    System.out.print("Please enter your vote: ");
                    String userChoice = scanner.nextLine();

                    Vote vote = new Vote(voterId, votersTopic, userChoice);
                    blockchain.addBlock(vote);
                    System.out.println("Vote has been added to the blockchain!");
                    break;

                case "2":
                    blockchain.printChain();
                    break;
                case "3":
                    boolean isValid = blockchain.isChainValid();
                    System.out.println("The blockchain is " + (isValid ? "Valid!" : "INVALID!"));
                    break;
                case "4":
                    System.out.println("Exiting voting system, Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please enter a number 1-4.");

            }
        }
    }
}
