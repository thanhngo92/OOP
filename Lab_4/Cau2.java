public class Cau2
{
    public static String shortName (String str)
    {
        String[] words = str.split(" "); // ("\\s+");
        return words[words.length - 1] + " " + words[0];
    }
    
    public static String hashTagName(String str)
    {
        String[] words = str.split(" ");
        return "#" + words[words.length - 1] + words[0];
    }
    
    public static String upperCaseAllVowel(String str)
    {
        String vowel = "aoeuiAOEUI";
        String result = "";
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(vowel.indexOf(c) != -1)
            {
                result += Character.toUpperCase(c);   
            }
            else
            {
                result += c;
            }
        }
        return result;
    }
    
    public static String upperCaseAllN(String str)
    {
        if(str == null)
        {
            return "";
        }
        String result = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'n')
            {
                result += Character.toUpperCase(str.charAt(i));
            }
            else
            {
                result += str.charAt(i);
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        String ex1 = "Nguyen Le Trong Tin";
        System.out.println(shortName(ex1));
        System.out.println(hashTagName(ex1));
        System.out.println(upperCaseAllVowel(ex1));
        System.out.println(upperCaseAllN(ex1));
    }
}