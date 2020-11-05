public class MidString {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }

    public static  String getMiddle(String str) {
        int l = str.length();
        String midStr = null;
        if (l == 1) {
            return str;
        }
        int mid = l / 2;
        if (l % 2 == 0) {
            midStr =  String.valueOf(str.charAt(mid-1)) +str.charAt(mid)  ;
            return midStr;
        } else if (l % 2 == 1) {
            midStr =String.valueOf(str.charAt(mid));
            return midStr;
        } else
            return midStr;
    }
}