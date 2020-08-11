import java.io.CharConversionException;

public class Main {

	public static void main(String[] args) {
		 Encrypt encrypt = new Encrypt();
		 Decrypt decrypt = new Decrypt();
		 String key = "တစ်သုည";
		 String test = "မင်္ဂလာပါ။ Hello Everyone";
		 
		 String cipherTest = encrypt.encrypt(key, test);
		 String decipherTest = decrypt.decrypt(key, cipherTest);

		 System.out.println(cipherTest);
		 System.out.println(decipherTest);
	}
}
