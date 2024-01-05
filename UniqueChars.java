/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) 
    {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) 
    {
        String uniq = "";
        boolean flag;
        for (int i = 0;i < str.length(); i++) 
        {
            flag = true;
            for(int j = 0; j < uniq.length(); j++)
            {
                if(str.charAt(i) == uniq.charAt(j)) 
                {
                    flag = false; 
                }
            }
            if(flag || str.charAt(i) == 32)//equal to space
            {
                uniq = uniq + str.charAt(i);
            }
        }
        return uniq;
    }
}
