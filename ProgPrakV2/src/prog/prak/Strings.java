package prog.prak;

public class Strings {
    public static String reverse(String s){
        char[] input = new char[s.length()];
        int len = s.length();

        for(int i = 0; i < len; i++){
            input[i] = s.charAt(len-i-1);
        }

        return new String(input);
    }

    public static boolean stringEqual(String a, String b){
        boolean flag = false;

        if(a.length() == b.length()){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == b.charAt(i)){
                    flag = true;
                }else{
                    flag = false;
                    break;
                    //return false;
                }
            }
        }else{
            flag = false;
        }

        return flag;
    }

    public static boolean isPalindrome(String s){
        boolean flag = false;
        String reverseS = reverse(s);

        if(s.length() == 0){
            return true;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == reverseS.charAt(i)){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static long parseLong(String s, int radix){
        long erg = 0;

        if(s.length() == 0){
            erg = 0;
        }else{
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(0) == '-') {
                    erg += digitFromChar(s.charAt(i)) * Math.pow(radix, s.length() -1 - i);
                    if (i == s.length() - 1) {
                        erg = erg * (-1);
                    }
                }else{
                    erg += digitFromChar(s.charAt(i)) * Math.pow(radix, s.length() - 1 - i);
                }
            }
        }
        return erg;
    }

    private static int digitFromChar(char c){
        int val = 0;
        switch((int)c) {
            case 48: val = 0; break;
            case 49: val = 1; break;
            case 50: val = 2; break;
            case 51: val = 3; break;
            case 52: val = 4; break;
            case 53: val = 5; break;
            case 54: val = 6; break;
            case 55: val = 7; break;
            case 56: val = 8; break;
            case 57: val = 9; break;
            case 65:
            case 97: val = 10; break;
            case 66:
            case 98: val = 11; break;
            case 67:
            case 99: val = 12; break;
            case 68:
            case 100: val = 13; break;
            case 69:
            case 101: val = 14; break;
            case 70:
            case 102: val = 15; break;
            default: break;
        }
        return val;
    }

    public static String reverse2(String s) {
        final int len = s.length();
        final int iMax = len - 1;
        char[] buffer = new char[len];
        char[] reversed = reverse(s, 0, iMax, buffer);
        return new String(reversed);
    }
    private static char[] reverse(String s, int i, int iMax, char[] buffer) {
        buffer[i] = s.charAt(iMax -i);
        while(i != iMax){
            i++;
            reverse(s, i, iMax, buffer);
        }
        return buffer;
    }
}
