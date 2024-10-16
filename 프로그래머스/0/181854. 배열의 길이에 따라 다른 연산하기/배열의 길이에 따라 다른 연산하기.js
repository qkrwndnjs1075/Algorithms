function solution(arr, n) {
    var answer = [];
    
    for (let i = arr.length % 2 * - 1 + 1; i < arr.length; i += 2){
            arr[i] += n;
        }
    return arr;
}