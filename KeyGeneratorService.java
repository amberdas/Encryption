package security.practice;

//Simple class to get key generator instance
//This design will ensure that whole flow will use same instance of key generator
public class KeyGeneratorService 
{
	private static MyKeyGenerator myKeyGenerator=null;
	
	public static MyKeyGenerator getMyKeyGeneratorInstance()
	{
		if(null==myKeyGenerator)
		{
			myKeyGenerator=new MyKeyGenerator();
		}
		return myKeyGenerator;
	}
}
