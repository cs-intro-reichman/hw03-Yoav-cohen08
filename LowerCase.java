/** String processing exercise 1. */
public class lowercase 
{
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) 
    {
        String down = "";
        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i)) >= 65 && (str.charAt(i) <= 90))
            {
                down = down + ((char)(str.charAt(i) + 32));
            }
            else
            {
                down = down + str.charAt(i);
            }
        }
        return down;
    }
}
