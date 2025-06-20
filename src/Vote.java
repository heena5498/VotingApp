public class Vote {

    private String voterId;
    private final boolean isYay; // Yay or Nay

    public Vote(String voterId, boolean isYay){
        this.voterId = voterId;
        this.isYay = isYay;
    }

    public String getVoterId(){
        return voterId;
    }

    public boolean isYay(){
        return isYay;
    }

    @Override
    public String toString(){
        return "Voter: " + voterId + ", Vote: " + (isYay ? "Yay" : "Nay");
    }

}
