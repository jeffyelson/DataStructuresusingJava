import java.lang.Math;
import java.util.Arrays;

public class Block {
    String message;
    long proofOfWork;
    int previousHashCode;
    int hashCode;

    public Block(String msg, long proof, int previousHash) {
        // TODO: your implementation here
        this.message = msg;
        this.proofOfWork = proof;
        this.previousHashCode = previousHash;
        char[] ch = msg.toCharArray();
        //Object[] contents = {Arrays.hashCode(ch),previousHash};
        this.hashCode = hashCode();
    }

    public int getStoredHashCode() {
        return previousHashCode;
    }

    public void setPreviousHashCode(int previousHashCode) {
        this.previousHashCode = previousHashCode;
    }

    @Override
    public boolean equals(Object o) {
        // TODO: your implementation here
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Block obj = (Block) o;
        return hashCode == obj.hashCode &&
                proofOfWork == obj.proofOfWork &&
                message.equals(obj.message) &&
                previousHashCode == obj.previousHashCode;
    }

    @Override
    public int hashCode() {
        // TODO: your implementation here
        return hashCode;
    }

    public String toString() {
        return "['" + message + "' | " + proofOfWork + " | " + previousHashCode + "]";
    }
}
