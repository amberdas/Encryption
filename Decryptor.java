package security.practice;

public interface Decryptor 
{
	String getDecryptedText();
	void textDecryptor(byte[] textToDecrypt);
}
