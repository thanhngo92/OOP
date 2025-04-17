public class Dictionary
{
    private static Word[] words = new Word[100];
    private static int wordCount = 0;
    
    public static boolean addWord(String newWord, String newMeaning)
    {
        for(int i = 0; i < wordCount; i++)
        {
            if(words[i].getWord().equals(newWord))
            {
                return words[i].addMeaning(newMeaning);
            }
        }
        
        if(wordCount < 100)
        {
            words[wordCount++] = new Word(newWord,newMeaning);
            return true;
        }
        return false;
    }
    
    public static boolean removeWord(String nesWord)
    {
        for(int i = 0; i < wordCount; i++)
        {
            if(words[i].getWord().equals(nesWord))
            {
                for(int j = i; j < wordCount - 1; j++)
                {
                    words[i] = words[i + 1];
                }
                
                words[--wordCount] = null;
                return true;
            }
        }
        return false;
    }
    
    public static boolean removeMeaning(String nesWord, int index)
    {
        for(int i = 0; i < wordCount; i++)
        {
            if(words[i].getWord().equals(nesWord))
            {
                if(words[i].getWord().equals(nesWord))
                return words[i].removeMeaning(index);
            }
        }
        return false;
    }
    
    public static String searchWord(String searchWord)
    {
        for(int i = 0; i < wordCount; i++)
        {
            if(words[i].getWord().equals(searchWord))
                return words[i].toString();
        }
        return "Word not found!";
    }
    
    public static int getWordCount()
    {
        return wordCount;
    }
    
    
    public static void printMeaning(String word)
    {
        for(int i = 0; i < getWordCount(); i++)
        {
            if(words[i].getWord().equals(word))
            {
                for(int j = 0; j < words[i].getMeaningCount(); j++)
                {
                    System.out.println(words[i].getMeaning(j));
                    System.out.println("\n");
                }
            }
        }
    }
    
    @Override
    public String toString()
    {
        String result = "Dictionary:\n";
        for(int i = 0; i < wordCount; i++)
        {
            result += words[i].toString() + "\n";
        }
        return result;
    }
       
}