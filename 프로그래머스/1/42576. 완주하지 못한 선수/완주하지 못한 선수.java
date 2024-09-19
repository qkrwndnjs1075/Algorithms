import java.util.*; 

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        LinkedList<String> retire = new LinkedList<>(Arrays.asList(participant));
        
        Arrays.sort(completion);
        retire.sort(Comparator.naturalOrder());
        
        for (int i = 0 ; i < completion.length ; i++) {
            
            if (retire.get(0).equals(completion[i])) {
                retire.remove(0);
                
            }
            else if (retire.get(1).equals(completion[i])) {
                retire.remove(1);
            }
        }
        answer = retire.get(0);
        return answer;
    }
}










