function solution(my_string, is_suffix) {
  return my_string.endsWith(is_suffix) ? 1 : 0;
}

function solution(my_string, is_suffix) {
    var answer = 0;
    for(let i=0;i<my_string.length;i++){
        if(my_string.slice(i) == is_suffix){ // i번째 문자부터 끝까지의 부분 문자열이 is_suffix와 동일한지 검사
            return 1;
        }
    }
    return answer;
}




