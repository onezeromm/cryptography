
public class Encrypt {
	
	public String encrypt(String key, String Text)
	{
	   String ciphered = "";
		 
	   char[] keys = key.toCharArray();
	   char[] originalText = Text.toCharArray();

       int nkey = 0;

       for (int i = 0; i < Text.length(); i++)
       {
           if (nkey >= keys.length)
           {
               nkey = 0;
           }

           originalText[i] = (char)((int)originalText[i]  + (int)keys[nkey]);
           
           nkey++;
           ciphered += Character.toString(originalText[i]) ;
       }
       
       return ciphered;
	}
}
