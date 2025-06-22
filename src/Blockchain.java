import java.util.ArrayList;
import java.util.List;


public class Blockchain {

    private final List<Block> blockchain;

    public Blockchain(){
        blockchain = new ArrayList<>();
        blockchain.add(createGenBlock());
    }

    private Block createGenBlock() {
        return new Block(0, "0", new Vote("genesis (start)", "N/A"));
    }

    public Block getLatestBlock(){
        return blockchain.getLast();
    }

    public void addBlock(Vote vote) {
        Block previousBlock = getLatestBlock();
        Block newBlock = new Block(blockchain.size(), previousBlock.getHash(), vote);
        blockchain.add(newBlock);
    }

    public boolean isChainValid(){
        for (int i = 1; i < blockchain.size(); i++) {
            Block current = blockchain.get(i);
            Block previous = blockchain.get(i - 1);

            if (!current.getHash().equals(current.calculateHash())) {
                return false;
            }

            if (!current.getPreviousHash().equals(previous.getHash())) {
                return false;
            }
        }
        return true;
    }

    public void printChain() {
        for (Block block : blockchain) {
            System.out.println(block);
        }
    }

}
