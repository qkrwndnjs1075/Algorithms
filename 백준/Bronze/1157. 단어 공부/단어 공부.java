import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i<word.length(); i++){
            count[word.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for(int i = 0; i<26; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            }else if(count[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);


    }
}