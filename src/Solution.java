/**
 * Created by Admin on 11/15/2016.
 */
public class Solution {
    public static int solution(int[] a) {
        int temp = (a.length % 4 == 0) ? a.length : (a.length % 4 == 1) ? 1 : (a.length % 4 == 2) ? a.length + 1 : 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] != (a.length + 1)) {
                temp ^= a[i];
            }
        }
        return temp;
    }
}
