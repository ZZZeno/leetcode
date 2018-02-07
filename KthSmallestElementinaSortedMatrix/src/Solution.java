import java.util.Arrays;

/**
 * Created by Zeno on 2/2/18.
 */
public class Solution {
    public static int kthSmallest(int[][] matrix, int k) {
        int smallest = matrix[0][0];
        int len = matrix.length;
        int first_column[] = new int[len];
        int biggest = 0;
        for (int i = 0; i < len; i++) {
            first_column[i] = 0;
            if(matrix[i][len-1] > biggest){
                biggest = matrix[i][len-1];
            }
        }
        int cnt = 0;
        while (cnt < k) {
            smallest = biggest;
            int change = 0;
            for (int i = 0; i < len; i++){
                if(first_column[i] > len-1){
                    continue;
                }
                if(smallest > matrix[i][first_column[i]]){
                    smallest = matrix[i][first_column[i]];
                    change = i;
                }
            }
            first_column[change] += 1;
            cnt++;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[][] tmp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tmp[i][j] = i + j * 5;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tmp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(kthSmallest(tmp, 7));

    }
}
