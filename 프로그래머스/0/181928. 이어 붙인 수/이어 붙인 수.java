class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";

        for(int i = 0; i < num_list.length;i++){
            if(num_list[i] % 2 == 0){
               a += num_list[i];
            } else {
                b += num_list[i];
            }

        }
        
        int totalA = Integer.parseInt(a);
        int totalB = Integer.parseInt(b);

        return totalA + totalB;
    }
}