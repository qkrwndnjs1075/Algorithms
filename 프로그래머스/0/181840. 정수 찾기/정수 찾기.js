function solution(num_list, n) {
    var answer = 0;
    
    for(let i = 0; i<num_list.length; i++) 
        if(n == num_list[i]) {
            return 1;
            
        }
    
    
    return 0;
}