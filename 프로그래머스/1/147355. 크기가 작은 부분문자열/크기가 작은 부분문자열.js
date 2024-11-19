function solution(t, p) {
    var answer = [];
    
    for(let i=0; i< t.length - p.length +1; i++){
        answer.push(t.substring(i,p.length))
    }
    answer = answer.filter((answer) => answer <= parseInt(p))
    
    
    return answer;
}







function solution(t, p) {
    var answer = [];
    for(var i =0; i < t.length - p.length +1; i++){
       answer.push(t.substr(i,p.length));
    }
    answer = answer.filter(a=>a<=parseInt(p));
    return answer.length;
}