public class Vote {

    private final String voterId;
    //private final String voteTopic;
    //private final String voterFirstName;
    //private final String voterLastName;
    private final String candidate;

    public Vote(String voterId, String candidate){
        this.voterId = voterId;
        //this.voterFirstName = voterFirstName;
        //this.voterLastName = voterLastName;
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
