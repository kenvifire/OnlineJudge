package Leecode;

public class Prob_521 {
    public int findLUSlength(String a, String b) {
        if(a.length() != b.length())  {
            return Math.max(a.length(), b.length());
        }

        if(a.equals(b)) return -1;
        else return a.length();


    }


}
