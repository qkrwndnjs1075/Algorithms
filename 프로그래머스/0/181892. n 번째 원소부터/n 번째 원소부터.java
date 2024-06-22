import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] newarray = new int[num_list.length - (n-1)];
        System.arraycopy(num_list, n - 1, newarray, 0, newarray.length);
        
        return newarray;
    }
}
