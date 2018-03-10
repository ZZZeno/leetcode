/**
 * Created by Zeno on 3/10/18.
 */
public class Sorts {
    public static void QuickSorts(int nums[], int low, int high){
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int start = nums[i];
        while(i < j){
            while(start <= nums[j] && i < j){
                j --;
            }
            nums[i] = nums[j];
            while(nums[i] <= start && i < j){
                i ++;
            }
            nums[j] = nums[i];
        }
        nums[i] = start;
        QuickSorts(nums, low, i-1);
        QuickSorts(nums, i+1, high);
    }

    public static void BubbleSort(int nums[]){
        int len = nums.length;

        for(int j = 0; j < len; j ++){
            boolean flag = true;
            for(int i = 1; i < len-j; i ++){
                if(nums[i-1] > nums[i]){
                    int tmp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = tmp;
                    flag = false;
                }
            }
            if(flag == true){   //如果一趟排序没有发生任何交换，则提前终止
                return;
            }
        }
    }

    public static void InsertSort(int nums[]){
        int len = nums.length;
        for(int i = 1; i < len; i ++){
            for(int j =i; j > 0; j --){
                if(nums[j] < nums[j-1]){
                    int tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
    }

    public static void SelectionSort(int nums[]){
        int len = nums.length;
        for(int i = 0; i < len; i ++){
            int minIndex = i;
            for(int j = i; j < len; j ++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = tmp;
        }
    }


    
    public static void main(String[] args){
        int a[] = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        SelectionSort(a);
        for(int x: a)
            System.out.println(x);
    }


}
