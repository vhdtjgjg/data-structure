package problem.n600.p551;

public class RecordCheck {
    public boolean checkRecord(String s) {

        int absentCount=0;
        int continuousLateCount=0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='L'){
                continuousLateCount++;
            }else {
                continuousLateCount=0;
            }
            if(chars[i]=='A'){
                absentCount++;
            }
            if(absentCount==2){
                return false;
            }
            if(continuousLateCount==3){
                return false;
            }

        }

        return true;
    }
}
