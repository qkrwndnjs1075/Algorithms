function solution(num_list) {
    var answer = 0;
    var answer2 = 0;
    
    for(let i=0; i<num_list.length; i++){
        if(i%2==0){
            answer += num_list[i];
        }else
            answer2 += num_list[i];
    }
    if(answer<answer2){
        return answer2
    }else return answer
    
    
}