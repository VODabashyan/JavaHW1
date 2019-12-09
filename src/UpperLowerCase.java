public class UpperLowerCase {
    static void printer() {
        String s = "hello world";
        for (int i = 1; i <= s.length(); i++) {
            if(i == 6) {
                continue;
            }
            String upperCase = s.substring(i - 1, i).toUpperCase();
            String temp1 = s.substring(0, i-1);
            String temp2 = s.substring(i, s.length());
            System.out.println(temp1 + upperCase + temp2);
        }
    }

    public static void main(String[] args) {
        int j;
        for(j=0; ; j = j+1){
            printer();
        }
    }
}
