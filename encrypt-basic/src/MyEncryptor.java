import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;

public class MyEncryptor implements Encryptor {
    private byte[] textToEncrypt;
    private byte[] encryptedText;
    private MyKeyGenerator myKeyGenerator = KeyGeneratorService.getMyKeyGeneratorInstance();

    public MyEncryptor(String stringToEncrypt) {
        this.textToEncrypt = stringToEncrypt.getBytes();
        this.textEncryptor(this.textToEncrypt);
    }

    @Override
    public void textEncryptor(byte[] textToEncrypt) {
        try {
            myKeyGenerator.getDesCipher().init(Cipher.ENCRYPT_MODE, myKeyGenerator.getMyDeskKey());
            encryptedText = myKeyGenerator.getDesCipher().doFinal(textToEncrypt);
        } catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    public byte[] getEncryptedText() {
        return encryptedText;
    }


}
