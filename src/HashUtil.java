import java.security.MessageDigest;

public class HashUtil {

    public static String applySha256(String input){

        try {
            // create SHA-256 digest object
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // convert input string to bytes
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));

            // convert byte array to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // return string
            return hexString.toString();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
