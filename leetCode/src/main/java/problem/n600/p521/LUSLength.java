package problem.n600.p521;

public class LUSLength {

    public int findLUSlength(String a, String b) {

        if(a.equals(b)){
            return -1;
        }

        if(a.length()<b.length()){
            return b.length();
        }


        if(a.length()>b.length()){
            return a.length();
        }

        int length = a.length();

        char[] lenChars = a.toCharArray();

        for (int i = 0; i < b.length(); i++) {
            for (char lenChar : lenChars) {
                if (lenChar != b.charAt(i)) {
                    return length;
                }
            }
        }
        return length;
    }
}
