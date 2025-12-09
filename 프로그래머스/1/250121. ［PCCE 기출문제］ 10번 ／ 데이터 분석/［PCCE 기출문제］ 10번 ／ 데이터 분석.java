import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 오타 수정: Coloumn -> Column
        int extIdx = getColumnIndex(ext);
        int sortIdx = getColumnIndex(sort_by);
        
        List<int[]> filteredList = new ArrayList<>();
        
        for(int[] row : data) {
            if(row[extIdx] < val_ext){
                filteredList.add(row);
            }
        }
        
        filteredList.sort((o1, o2)-> o1[sortIdx] - o2[sortIdx]);
        
        return filteredList.toArray(new int[0][]);
    }
    
    // 오타 수정 및 default 추가
    private int getColumnIndex(String column) {
        switch(column) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: throw new IllegalArgumentException("에러");
        }
    }
}