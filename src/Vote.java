public class Vote {

    private final String voterId;
    private final int voteTopic;
    //private final String voterFirstName;
    //private final String voterLastName;
    private final String candidate;

    public Vote(String voterId, int voteTopic, String candidate){
        this.voterId = voterId;
        this.voteTopic = voteTopic;
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
        return "Voter: " + voterId + ", Vote Topic: " + voteTopic + ", Vote: " + candidate;
    }

}
