package security.practice;

/*User Interface to use Encryptor / Decryptor interface*/

public class EncryptionDecryptionDriver {

	public static void main(String[] args) 
	{
		String userName= "user1";
		String password= "pwd";
		
		//This is Polymorphism as we are using reference of type Encryptor Interface, 
		//so that in future we can assin some different implementation of encryptor.
		
		Encryptor myEncryptor=new MyEncryptor(userName);
		
		//Eg: myEncryptor= new MyEncryptor2();
		// myEncryptor= new MyEncryptor3();
		
		
		//Encrypted text will be different for each run 
		// When we are trying to call myEncryptor.getEncryptedText() from this class, then it is acting as abstraction, 
		//as we do not know about its implementation in ths class.
		
		System.out.println("Encrypted UserName: "+new String(myEncryptor.getEncryptedText()));
		
		Decryptor myDecryptor=new MyDecryptor(myEncryptor.getEncryptedText());
		System.out.println("Decrypted UserName: "+myDecryptor.getDecryptedText());
		
		myEncryptor=new MyEncryptor(password);
		//Again this will be different for each run
		System.out.println("Encrypted Password: "+new String(myEncryptor.getEncryptedText()));
		
		myDecryptor=new MyDecryptor(myEncryptor.getEncryptedText());
		System.out.println("Decrypted Password: "+myDecryptor.getDecryptedText());

	}

}
