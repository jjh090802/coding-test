class Solution {
    public int solution(int n, int k) {
        int F = 12000;
        int D = 2000;
        
        int FN = F * n;
        int DN = D * k;
        int Discount = 0;
        
        int value = 0;
        
        if(n / 10 != 0){
           Discount = D * (n / 10);
        }
        
        value = FN + DN - Discount;
        
        
        return value;
    }
}