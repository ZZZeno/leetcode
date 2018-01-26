/**
 * Created by Zeno on 1/26/18.
 */
public class Solution {
    public static int minSwapsCouples(int[] row) {
        int couples = row.length / 2;
        int i;
        boolean checked[] = new boolean[couples];
        int cnt = 0;
        for (i = 0; i < row.length; i += 2) {
            if (row[i] % 2 == 0) {
                if(row[i+1] == row[i]+1){
                    continue;
                }else {
                    int j = i;
                    while(row[j] != row[i]+1){
                        j ++;
                    }
                    row[j] = row[i+1];
                    row[i+1] = row[i]+1;
                    cnt ++;
                }
            } else {
                if(row[i+1] == row[i]-1){
                    continue;
                }else {
                    int j = i;
                    while(row[j] != row[i]-1){
                        j ++;
                    }
                    row[j] = row[i+1];
                    row[i+1] = row[i]-1;
                    cnt ++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args){
        int row[] = {5,4,2,6,3,1,0,7};
        int n = minSwapsCouples(row);
        System.out.println(n);
    }
}
