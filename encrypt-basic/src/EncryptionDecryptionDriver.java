/*User Interface to use Encryptor / Decryptor interface*/

public class EncryptionDecryptionDriver {

    public static void main(String[] args) {

        String userName = "user1";
        String password = "pwd";

        Encryptor myEncryptor = new MyEncryptor(userName);

        System.out.println("Encrypted UserName: " + new String(myEncryptor.getEncryptedText()));

        Decryptor myDecryptor = new MyDecryptor(myEncryptor.getEncryptedText());
        System.out.println("Decrypted UserName: " + myDecryptor.getDecryptedText());

        myEncryptor = new MyEncryptor(password);
        System.out.println("Encrypted Password: " + new String(myEncryptor.getEncryptedText()));

        myDecryptor = new MyDecryptor(myEncryptor.getEncryptedText());
        System.out.println("Decrypted Password: " + myDecryptor.getDecryptedText());
    }
}
