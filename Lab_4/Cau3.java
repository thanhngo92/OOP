public class Cau3
{
    
    public static int countWord(String paragraph)
    {
        String[] words = paragraph.split("\\s+");
        return words.length;
    }
    
    public static int countSentences(String paragraph)
    {
        int count = 0;
        for(int i = 0; i < paragraph.length(); i++)
        {
            char c = paragraph.charAt(i);
            if(c == '.' || c == '!' || c == '?')
            {
                count++;
            }
        }
        return count;
    }
    
    public static int countAppear(String paragraph, String word)
    {
        int count = 0;
        String[] words = paragraph.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            String temp = words[i];
            if(temp.equals(word))
                count++;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        String str = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        System.out.println(countWord(str));
        System.out.println(countSentences(str));
        System.out.println(countAppear(str, "and"));
    }
}