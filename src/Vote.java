public class Vote {

    private final String voterId;
    private final String candidate; // take user input

    public Vote(String voterId, String candidate){
        this.voterId = voterId;
        this.candidate = candidate;
    }

    public String getVoterId(){
        return voterId;
    }

    public String getCandidate(){
        return candidate;
    }


    @Override
    public String toString(){
        return "Voter: " + voterId + ", Vote: " + candidate;
    }

}
