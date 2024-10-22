function solution(arr) {
    var x = [];
    for(let a of arr){
        for(let i=0;i<a;i++){
            x.push(a);
        }
    }
    return x;
}