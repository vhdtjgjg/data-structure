package problem.n600.p541;

public class ReverseStr {

    public String reverseStr(String s, int k) {

        int length = s.length();
        int k1=k*2;
        boolean flag=false;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int remain = length - i;
            if(remain>=2*k||flag){
                if(i+1==k1){
                    result.append(new StringBuilder(s.substring(k1-2*k,k1-k)).reverse());
                    result.append(s, k1-k, k1);
                    k1+=2*k;
                    flag=false;
                }else {
                    flag=true;
                }
                continue;
            }
            if ((remain<k)) {
                result.append(new StringBuilder(s.substring(i)).reverse());
                return result.toString();
            }
            if(remain<2*k){
                result.append(new StringBuilder(s.substring(i,i+k)).reverse());
                result.append(s.substring(i+k));
                return result.toString();
            }

        }

        return result.toString();
    }
}
