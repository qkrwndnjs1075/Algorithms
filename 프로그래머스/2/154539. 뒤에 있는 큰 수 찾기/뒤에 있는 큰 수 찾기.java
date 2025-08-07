import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] result = new int[numbers.length];
        
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i<numbers.length; i++){
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i] ){
                result[stack.pop()] = numbers[i]; //3,5,5,-1
            }
                stack.push(i); //1,2
        }
            return result;
        
    }
}









// import java.util.*;

// class Solution {
//     public int[] solution(int[] numbers) {
//         int[] result = new int[numbers.length];
//         Arrays.fill(result, -1);
        
//         Stack<Integer> stack = new Stack<>();
        
//         for (int i = 0; i < numbers.length; i++) {
//             while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
//                 result[stack.pop()] = numbers[i];
//             }
//             stack.push(i);
//         }
        
//         return result;
//     }
// }