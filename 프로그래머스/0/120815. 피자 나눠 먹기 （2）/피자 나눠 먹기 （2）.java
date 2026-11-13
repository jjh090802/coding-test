class Solution {
    public int solution(int n) {
        int count = 0;
        while(n > count){
            count+=1;
            if(count*6%n == 0){
                break;
            }
        }
        
        return count;
    }
}