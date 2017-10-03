import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class MyKeyGenerator {
    private static KeyGenerator keyGenerator;
    private static SecretKey myDeskKey;
    private static Cipher desCipher;

    public MyKeyGenerator() {

        if (null == keyGenerator && null == myDeskKey && null == desCipher) {
            try {
                keyGenerator = KeyGenerator.getInstance("DES");
                desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                e.printStackTrace();
            }
            myDeskKey = keyGenerator.generateKey();
        }


    }

    public KeyGenerator getKeyGenerator() {
        return keyGenerator;
    }

    public SecretKey getMyDeskKey() {
        return myDeskKey;
    }

    public Cipher getDesCipher() {
        return desCipher;
    }

}
