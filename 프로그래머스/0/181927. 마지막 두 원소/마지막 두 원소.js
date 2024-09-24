function solution(num_list) {
    let answer = [...num_list];
    let end = num_list.length - 1;
    if(num_list[end] > num_list[end-1]){
        answer.push(num_list[end] - num_list[end-1])
    }else{
        answer.push(num_list[end] * 2)
    }
    return answer;
}