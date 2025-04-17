import java.util.Scanner;
public class Main 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dictionary dc = new Dictionary();
        String x,y;
        int index;

    
        dc.addWord("apple", "A fruit that is red or green");
        dc.addWord("apple", "A tech company");
        dc.addWord("banana", "A yellow fruit");
        dc.addWord("java", "A programming language");
        dc.addWord("java", "An island of Indonesia");

        System.out.println(dc);            
        while(true)
        {
            System.out.println("1. Add Word (or Add Meaning to Existing Word)");
            System.out.println("2. Remove Meaning");
            System.out.println("3. Look Up Word");
            System.out.println("4. Check Word Count");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int op = sc.nextInt();
            if(op < 0 || op > 5) continue;
            switch(op)
            {
                case 1: 
                    System.out.print("Enter word: ");
                    sc.nextLine();
                    x = sc.next();
                    
                    System.out.print("Enter meaning: ");
                    y = sc.nextLine();
                    if(dc.addWord(x, y))
                    {
                        System.out.println("Word/meaning added successfully");
                    }
                    break;
                case 2:
                    System.out.print("Enter word: ");
                    sc.nextLine();
                    x = sc.nextLine();
                    dc.printMeaning(x);
                    sc.nextLine();
                    System.out.print("Enter index of meaning to remove: ");
                    index = sc.nextInt();
                    if(dc.removeMeaning(x, index))
                    {
                        System.out.println("Meaning removed successfully!");
                    }
                    break;
                case 3:
                    System.out.print("Enter word to look up: ");
                    sc.nextLine();
                    x = sc.nextLine();
                    System.out.println(dc.searchWord(x));
                    break;
                case 4:
                    System.out.println("Total words in dictionary: " + dc.getWordCount());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}