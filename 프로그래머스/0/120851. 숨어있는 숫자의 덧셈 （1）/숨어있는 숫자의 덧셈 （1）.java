class Solution {
    public int solution(String my_string) {
        int answer = my_string.replaceAll("[^0-9]", "").chars().map(Character::getNumericValue).sum();
        return answer;
    }
}