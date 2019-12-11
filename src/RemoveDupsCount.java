/**
 * Created by nishita.kheur on 4/4/17.
 */
public class RemoveDupsCount {
    public int removeDuplicates(int[] A) {
        if (A.length < 2)
            return A.length;

        int j = 0;
        int i = 1;

        while (i < A.length) {
            if (A[i] == A[j]) {
                i++;
            } else {
                j++;
                A[j] = A[i];
                i++;
            }
        }

        return j + 1;

    }
}
