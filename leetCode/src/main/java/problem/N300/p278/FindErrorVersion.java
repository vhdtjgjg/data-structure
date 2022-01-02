package problem.N300.p278;

public class FindErrorVersion extends VersionControl{

    public int firstBadVersion(int n) {

        int left=1;
        int right=n;

        while (left<right){
            int middle=left+(right-left)/2;
            if (isBadVersion(middle)) {
                right=middle;
                continue;
            }
            left=middle+1;
        }

        return right;
    }
}
