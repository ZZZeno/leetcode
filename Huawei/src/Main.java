/**
 * Created by Zeno on 3/17/18.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static char getMax(String str){
        char max = str.charAt(0);
        int i = 0;
        int len = str.length();
        while(i < len){
            if(str.charAt(i) > max){
                max = str.charAt(i);
            }
            i ++;
        }
        return max;
    }

    public static BigInteger BigIntAdd(List<String> BigInts){
        BigInteger ret = new BigInteger(BigInts.get(0));
        int len = BigInts.size();
        for(int i = 1; i < len; i ++){
            BigInteger tmp = new BigInteger(BigInts.get(i));
            ret = ret.add(tmp);
        }
        return ret;
    }
    
    public static void encode(String string){
        List<String> out = new ArrayList<>();
        int count = 1;
        for(int i = 0; i < string.length()-1; i ++){
            char cur = string.charAt(i);
            char next = string.charAt(i+1);
            if(cur == next){
                count ++;
            }else{
                if(count != 1){
                    System.out.print(count);
                }
                System.out.print(string.charAt(i));
                count = 1;
            }
        }
        if(count != 1){
            System.out.print(count);
        }
        System.out.print(string.charAt(string.length()-1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        for(int i = 0; i < string.length(); i ++){
            if(string.charAt(i) > 'z' || string.charAt(i) < 'a'){
                System.out.println("error");
                return;
            }
        }
        encode(string);
    }
}