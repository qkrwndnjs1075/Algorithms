class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int mola=0;
        int same=0;
        for(int l : lottos){
            if(l==0) mola++;
            for(int w : win_nums){
                if(l==w) same++;
            }
        }

        int best = 7-same-mola;
        int worst = 7-same;
        
        if(worst>6){
            worst = 6;
        }
        if(best>6){
            best = 6;
        }
        else if(best<1){
            best =1;
        }

        return new int[]{best, worst};
    }
}