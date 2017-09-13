public class KeyGeneratorService {

    private static MyKeyGenerator myKeyGenerator = null;

    public static MyKeyGenerator getMyKeyGeneratorInstance() {
        if (null == myKeyGenerator) {
            myKeyGenerator = new MyKeyGenerator();
        }
        return myKeyGenerator;
    }
}
