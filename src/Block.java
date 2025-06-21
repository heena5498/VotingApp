import java.time.LocalDateTime;

public class Block {
    private int index;
    private String prevHash;
    private String hash;
    private LocalDateTime timestamp;
    private Vote vote;

    public Block(int index, String prevHash, Vote vote){

        this.index = index;
        this.prevHash = prevHash;
        this.vote = vote;
        this.timestamp = LocalDateTime.now();
        this.hash = calculateHash();

    }

    public String calculateHash(){
        String data = index + prevHash + timestamp.toString() + vote.toString();
        return HashUtil.applySha256(data);
    }

    public String getHash(){
        return hash;
    }

    public String getPreviousHash(){
        return prevHash;
    }

    public Vote getVote(){
        return vote;
    }

    @Override
    public String toString(){
        return "Block #" + index + "\n" +
                "Timestamp: " + timestamp + "\n" +
                "Vote: " + vote + "\n" +
                "Previous Hash: " + prevHash + "\n" +
                "Hash: " + hash + "\n";
    }

}
