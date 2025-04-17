public class Cau2
{
	public static String[] count_Words(String s)
	{
        s = removePunctuation(s).toLowerCase();
		String[] words = s.split("\\s+");
		int l = 0;
		String[] temp = new String[words.length];
		for(int i = 0; i < words.length; i++)
		{
			boolean mark = false;
			for(int j = 0; j < words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					for(int k = 0; k < temp.length; k++)
					{
						if(words[i].equals(temp[k]))
						{
							mark = true;
							break;
						}
					}
				}
			}
			if(!mark) temp[l++] = words[i];
		}
		
		String[] uniqueWords = new String[l];
		for(int i = 0; i < l; i++)
		{
			uniqueWords[i] = temp[i];
		}
		return uniqueWords;
	}
	
	public static String removePunctuation(String s)
	{
	    String result = "";
	    for(int i = 0; i < s.length(); i++)
	    {
	        char c = s.charAt(i);
	        if((c >= 'A' && c <= 'Z') ||(c >= 'a' && c <= 'z') || c == ' ')
	        result += c;
	    }
	    return result;
	}
	public static String[][] count_Frequency(String s)
	{
	    String original = s;
	    s = removePunctuation(s).toLowerCase();
	    String[] words = s.split("\\s+");
		String[] uniqueWords = count_Words(s);
		String[][] fre = new String[uniqueWords.length][2];
		for(int i = 0; i < uniqueWords.length; i++)
		{
			fre[i][0] = findOriginalWord(uniqueWords[i], original);
			int count = 0;
			for(int j = 0; j < words.length; j++)
			{
			    if(uniqueWords[i].equals(words[j])) 
			        count++;
			    
			}
			fre[i][1] = String.valueOf(count);
		}
		return fre;
	}
	
	    public static String findOriginalWord(String lowerWord, String original) {
        String[] originalWords = original.split("\\s+");
        for (String word : originalWords) {
            String cleanWord = removePunctuation(word);
            if (cleanWord.equalsIgnoreCase(lowerWord)) {
                return word; 
            }
        }
        return lowerWord;
    }
	public static void printInfo(String[][] s)
	{
        for(int i = 0; i < s.length ; i++)
        {
            System.out.println(s[i][0] + ": " + s[i][1]);
        }
	}
	public static void main(String[] args)
	{
		String str = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
		String[][] s = count_Frequency(str);
		printInfo(s);
	}
}