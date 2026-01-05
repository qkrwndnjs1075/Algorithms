import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        
        for(int i = 0; i< survey.length; i++) {
            int choice = choices[i];
            
            if(choice == 4) continue;
            
            char disaAgree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            if(choice < 4) {
                scores.put(disaAgree, scores.getOrDefault(disaAgree, 0) + (4 - choice));
            } else {
                scores.put(agree, scores.getOrDefault(agree, 0) + (choice - 4));
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        String[] person = {"RT","CF","JM","AN"};
        
        for(String per : person) {
            char type1 = per.charAt(0);
            char type2 = per.charAt(1);
            
            int score1 = scores.getOrDefault(type1, 0);
            int score2 = scores.getOrDefault(type2, 0);
            
            if(score1 >= score2) {
                result.append(type1);
            }else {
                result.append(type2);
            }
            
        }
        return result.toString();
    }
}