import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder list = new StringBuilder();
        
        for(int i=0;i < a.length();i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                list.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)){
                list.append(Character.toUpperCase(c));
            }
            else {
                list.append(c);
            }
        }
        System.out.println(list.toString());
    }
}