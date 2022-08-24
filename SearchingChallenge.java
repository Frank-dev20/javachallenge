package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingChallenge {

        public static String SearchingChallenge(String str) {
            // code goes here
            List<String> list = new ArrayList<String>();
            String[] word = str.split("");
            int firstNumber = Integer.parseInt(word[0]);
            String newWord = "";

            int count = 0;
            while(count <firstNumber){
                if(word[count+1].equalsIgnoreCase(word[count+2])){
                    firstNumber +=1;
                }
                System.out.println(word[(count+1)]);
                newWord += word[count+1];
                count +=1;
            }
            list.add(newWord);
            return "";

        }

        public static void main (String[] args) {
            // keep this function call here
            SearchingChallenge sc = new SearchingChallenge();
            Scanner s = new Scanner(System.in);
            System.out.print(sc.SearchingChallenge("3aabacbebebe"));
        }
}
