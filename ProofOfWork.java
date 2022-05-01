import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class ProofOfWork {

    /* *** *** *** HELPER FUNCTIONS *** *** *** */
    static MessageDigest msgdig;

    static {
        try {
            msgdig = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException exc) {
            exc.printStackTrace();
        }
    }

    /**
     * Create an sha256 hash of the string representation of the number n and return the hash as a byte array.
     *
     * @param n A number
     * @return the sha256 hash of the string representation of n as byte array
     */
    public static byte[] sha256(long n) {
        return msgdig.digest(String.format("%d", n).getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Turns an array of bytes into a String of 0s and 1s
     *
     * @param bs The byte array
     * @return A String consisting only of '0' and '1'.
     */
    public static String byteArrayToBitString(byte[] bs) {
        StringBuilder out = new StringBuilder();
        for (byte b : bs) {
            out.append(String.format("%8s", (Integer.toBinaryString(b & 0xFF))));
        }
        return out.toString().replace(' ', '0');
    }

    /* *** *** *** *** *** *** *** *** *** ***  */

    public static int numberOfLeadingZeros(String s) {
        // TODO: your code here
        int zeros = 0;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (check == '0') {
                zeros += 1;
            }
            /**if (i == (s.length() - 1)) {
             zeros = 0;
             }**/
            else {
                break;
            }
        }
        return zeros;
    }

    // Find a number n such that sha256(n) starts with x zeros (ie. the first x bytes are all zero)
    public static long proofOfWork(int x) {
        Random rnd = new Random();
        // TODO: your code here
        long work = rnd.nextInt();
        while (x != numberOfLeadingZeros(byteArrayToBitString(sha256(work)))) {
            work = rnd.nextInt();
        }
        return work;
    }

    public static boolean verify(long n, int x) {
        // TODO: your code here
        int lead = numberOfLeadingZeros(byteArrayToBitString(sha256(n)));
        return lead == x;
    }

    public static void main(String[] args) {
        long n = proofOfWork(5);
        System.out.println(n);
        System.out.println(byteArrayToBitString(sha256(n)));
        System.out.println(verify(n, 5));
    }

}
