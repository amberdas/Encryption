package security.practice;

import java.security.InvalidKeyException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

public class MyDecryptor implements Decryptor
{
	private byte[] textToDecrypt;
	private byte[] decryptedText;
	private MyKeyGenerator myKeyGenerator=KeyGeneratorService.getMyKeyGeneratorInstance();
	
	
	public MyDecryptor(byte[] textToDecrypt)
	{
		this.textToDecrypt=textToDecrypt;
		this.textDecryptor(this.textToDecrypt);
	}
		
	public String getDecryptedText() {
		return new String(this.decryptedText);
	}
	
	@Override
	public void textDecryptor(byte[] textToDecrypt)
	{
		try 
		{
			myKeyGenerator.getDesCipher().init(Cipher.DECRYPT_MODE, myKeyGenerator.getMyDeskKey());
			decryptedText=myKeyGenerator.getDesCipher().doFinal(textToDecrypt);
		} catch (IllegalBlockSizeException | BadPaddingException | InvalidKeyException e) 
		{
			e.printStackTrace();
		} 
	}
	
	
	
}
