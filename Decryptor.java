package security.practice;

/*Abstraction Layer where we define the design of Decryptor
 * This means that any decryptor must have textdecryptor method which will
 * take byte array as argument to decrypt it*/

public interface Decryptor 
{
	String getDecryptedText();
	void textDecryptor(byte[] textToDecrypt);
}
