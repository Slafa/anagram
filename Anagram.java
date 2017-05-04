import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by slafa on 28.02.2017.
 */
public class Anagram {

    private static String anagramWord = "";
    private static String nextWord = "";
    private static File eventyr = new File("nsf2016.txt");
    private static ArrayList<String> words;
    private static Scanner sc;
    private static String checkWord = "";
    private static PrintWriter writer;
    private static int index;

    public static void main(String[] args) {
        try
        {
            writer = new PrintWriter(".txt", "UTF-8");
        }catch (IOException e){
            System.out.println("could not create file anagram.txt");
        }
        try {
            Anagram();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        writer.close();
    }

    private static void Anagram() throws FileNotFoundException {
        sc = new Scanner(eventyr);
        words = new ArrayList<>();

        while (sc.hasNext()) {
            words.add(sc.nextLine());
        }
        sc.close();
        printAnagram();
    }

    private static void printAnagram() {
        //check if the current word length in the array matches any of the others in the array.
        for(int i =0; i< words.size(); i++ ) {
            anagramWord = words.get(i);

            for (index = i + 1; index < words.size();index++) {
                nextWord = words.get(index);

                if (anagramWord.length() == nextWord.length()) {
                    if(checkForAnagram(anagramWord, nextWord)) index--;
                }
            }
        }
    }

    private static boolean checkForAnagram(String word1, String word2){
      boolean anagram = true;

        for (int i = 0; i < word1.length(); i++)
        {
            int check1 = 0;
            int check2 = 0;
            for (int checkChars = 0; checkChars < word1.length(); checkChars++)
            {
                if (word1.charAt(i) == word1.charAt(checkChars)) check1++;
                if (word1.charAt(i) == word2.charAt(checkChars)) check2++;
            }
                 if (check1 != check2) {

                    return false;
                 }
        }
                    if ((checkWord != word1))
                    {
                        System.out.print("\n" + word1);
                        writer.write("\n" + word1);
                        checkWord = word1;
                    }
                    writer.write(", " + word2);
                    System.out.print(", " + word2);
                    words.remove(index);

        return anagram;
    }
}






