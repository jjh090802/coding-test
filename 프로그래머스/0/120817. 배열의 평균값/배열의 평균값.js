function solution(numbers) {
    var answer = numbers.reduce((sum, curr) => sum + curr, 0) / numbers.length;
    
    return answer;
}