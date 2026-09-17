class Solution {
    public int solution(int n) {
        int a = 0;
        if(n % 2 == 0) {
            for(int i = n; i > 0;i -= 2) {
                a += i*i;
            }
            return a;
        } else {
            for(int i = n; i > 0;i -= 2) {
                a += i;
            }
            return a;
        }
    }
}