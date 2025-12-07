class Solution {
    
    private static final int[] DH = {0, 1, -1, 0};
    private static final int[] DW = {1, 0, 0, -1};
    
    
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        
        for(int i = 0; i<4; i++) {
            int h_check = h + DH[i];
            int w_check = w + DW[i];
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n){
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        return count;
        
    }
}