class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            String temp = word;
            for (String sound : sounds) {
                temp = temp.replace(sound, " ");
            }
            if (temp.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
