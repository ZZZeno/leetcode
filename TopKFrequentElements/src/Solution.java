import java.util.*;

/**
 * Created by Zeno on 1/24/18.
 */
public class Solution {
    public static List<Integer> topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }
        System.out.println(map.toString());
        int size = map.size();
        int frequence[] = new int[size];
        int flag = 0;
        for(Integer key: map.keySet()){
            frequence[flag] = map.get(key);
            flag ++;
            if(flag == size){
                break;
            }
        }
        Arrays.sort(frequence);
        int min_frequence = 0;
        for(int i = size-1; i > size-k-1; i --){
            min_frequence = frequence[i];
        }

        List<Integer> ret = new ArrayList<Integer>();
        for(Integer key: map.keySet()){
            if(map.get(key) >= min_frequence){
                ret.add(key);
            }
        }

        return ret;
    }
    public static void main(String[] args){
        int nums[] = {4,1,-1,2,-1,2,3};
        List<Integer> tmp = topKFrequent(nums, 2);
        System.out.println(tmp.toString());
    }
}
