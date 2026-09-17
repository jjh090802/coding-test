class Solution {
    public int solution(int a, int b) {
        //문자열인 수를 일단 만들고 거기서 정수로 다시 변환후에 서로 비교하여서 출력
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        String str = str_a + str_b;
        
        
        if(Integer.parseInt(str) > 2*a*b) {
            return Integer.parseInt(str);
        } else {
            return 2*a*b;
        }
    }
}