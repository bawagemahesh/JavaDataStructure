public class CyclicString {
    public static void main(String[] args) {

    }

    public static Integer cyclicString( String str ) {
        String s1= str;
        for (int answer = 1; answer < s1.length(); answer++) {
            boolean correct = true;
            for (int position = 0; position+answer < s1.length(); position++) {
                if (s1.charAt(position) != s1.charAt(position + answer)) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                return answer;
            }
        }
        return s1.length();
    }
}

