public class Vote {

    private final String voterId;
    private final String choice; // Yay or Nay

    public Vote(String voterId, String choice){
        this.voterId = voterId;
        this.choice = choice;
    }

    public String getVoterId(){
        return voterId;
    }

    public String choice(){
        return choice;
    }

    @Override
    public String toString(){
        return "Voter: " + voterId + ", Vote: " + choice;
    }

}
