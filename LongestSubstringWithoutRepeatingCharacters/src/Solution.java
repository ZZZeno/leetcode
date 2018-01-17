/**
 * Created by Zeno on 1/18/18.
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s){
        int startFlag = 0;
        int endFlag = 0;
        int len = s.length();
        String retStr;
        int max = 0;
        while(endFlag < len){
            retStr = s.substring(startFlag, endFlag);
            String cur = s.substring(endFlag, endFlag+1);
            if(retStr.indexOf(cur) == -1){
                endFlag += 1;
                if(endFlag - startFlag > max){
                    max = endFlag - startFlag;
                }
            }else{
                startFlag += retStr.indexOf(cur)+1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String tmp = "pwwkew";
        int t = lengthOfLongestSubstring(tmp);
        System.out.println(t);
    }
}
