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

    }

}
