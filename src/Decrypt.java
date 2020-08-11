
public class Decrypt {
	public String decrypt(String Key, String Text) {
		
		String deciphered = "";
	    
		char[] keys = Key.toCharArray();
	    char[] cipheredText = Text.toCharArray();

	    int nkey = 0;

	    for (int i = 0; i < Text.length(); i++)
	    {
	        if (nkey >= keys.length)
	        {
	            nkey = 0;
	        }
	        
	        cipheredText[i] = (char)((int)cipheredText[i] - (int)keys[nkey]);

            nkey++;

	        deciphered += Character.toString(cipheredText[i]) ;
	    }
	    return deciphered;
	}
}
