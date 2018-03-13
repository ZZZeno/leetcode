/**
 * Created by Zeno on 3/13/18.
 */
public class Solution {
    public static int hammingDistance(int x, int y){
        int n = x ^ y;
        int ret = 0;
        while(n > 0){
            int tmp = n % 2;
            if(tmp == 1){
                ret += 1;
            }
            n = n / 2;
        }
        return ret;
    }
    public static void main(String[] args){
        System.out.println(hammingDistance(1, 4));
//        System.out.println(1 ^ 4);
    }
}
