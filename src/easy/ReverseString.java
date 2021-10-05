package easy;

public class ReverseString {
    public static void main(String [] args){
        char[] s = {'H','a','n','n','a','h'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
    }

    public void reverseString(char[] s) {
        int end = s.length-1;
        int start = 0;
        for(int i = 0; i <= end/2; i++){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }

        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}

