package security.practice;

/*Abstraction Layer where we define the design of Encryptor
 * This means that any encryptor must have textencryptor method which will
 * take byte array as argument to encrypt it*/

public interface Encryptor 
{
	byte[] getEncryptedText();
	void textEncryptor(byte[] textToEncrypt);
}
