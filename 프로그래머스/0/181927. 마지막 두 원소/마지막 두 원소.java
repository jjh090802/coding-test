class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int last = num_list[length - 1];
        int prev = num_list[length - 2];
        
        // 추가할 값 계산
        int newValue = (last > prev) ? (last - prev) : (last * 2);
        
        // 기존 배열보다 크기가 1 더 큰 배열 생성
        int[] answer = new int[length + 1];
        
        // 기존 원소 복사
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }
        
        // 마지막 위치에 새로 계산된 값 추가
        answer[length] = newValue;
        
        return answer;
    }
}