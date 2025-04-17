public class vowels 
{
    public static String[] fl_Name(String s)
    {
        String[] word = s.split(" ");
        String firstName = word [0];
        String lastName = word [word.length - 1];
        return new String[] {firstName,lastName};
    }
    
    public static String middle_Name(String s)
    {
        String[] word = s.split(" ");
        String middle_Name = word[1];
        for(int i = 2; i < word.length - 1; i++)
        {
            middle_Name = middle_Name + " " + word[i];   
        }
        return middle_Name;
    }
    
    public static String Capialize(String c)
    {
        String[] words = c.split(" ");
        String full_Name = "";
        for(int i = 0; i < words.length; i++)
        {
            if(!words[i].isEmpty())
            {
                full_Name = full_Name + words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
            }
          
        }
        return full_Name;
    }
    
    public static String vowels_L(String s)
    {
        String vowels = "aoeuiAOEUI", result = "";
        for(char c : s.toCharArray())
        {
            result += (vowels.indexOf(c) != - 1) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            
        }
        return result;
    }
    
    public static void display_Info(String[] s)
    {
        for(String num : s)
        {
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        String s = "Nguyen Thi Thu Thao";
        display_Info(fl_Name(s));
        System.out.println(middle_Name(s));
        String c = "nguyen van chien";
        System.out.println(Capialize(c));
        System.out.println(vowels_L("Nguyen Van Chien"));
    }
}