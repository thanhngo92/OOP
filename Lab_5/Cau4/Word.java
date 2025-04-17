public class Word
{
    private String word;
    private String[] meaning = new String[10];
    private int meaningCount = 0;
    private void instanceMeaning()
    {
        for(int i = 0; i < 10; i++)
        {
            meaning[i] = new String();
        }
    }
    
    public Word(String words, String meaning)
    {
        word = words;
        instanceMeaning();
        this.meaning[meaningCount++] = meaning;
    }
    
    public boolean addMeaning(String newMeaning)
    {
        if(meaningCount >= 10) return false;
        for(int i = 0; i < meaningCount; i++)
        {
            if(meaning[i].equals(newMeaning)) return false;
        }
        meaning[meaningCount++] = newMeaning; 
        return true;
    }
    
    public boolean removeMeaning(int index)
    {
        if(index < 0 || index >= meaningCount) return false;
        for(int i = index; i < meaningCount - 1; i++)
        {
            meaning[i] = meaning[i + 1];
        }
        meaning[meaningCount - 1] = null;
        meaningCount--;
        return true;
    }
    
    public String getWord()
    { return word; }
    
    public String getMeaning(int index)
    {
        if(index < 0 || index >= meaningCount) return null;
        return meaning[index];
    }
    
    public int getMeaningCount()
        { return meaningCount ;}
    
    @Override
    public String toString()
    {
        String result = "Word: " + word + "\nMeanings:\n";
        for(int i = 0; i < meaningCount; i++)
        {
            result += "- " + meaning[i] + "\n";
        }
        return result;
    }
   
}