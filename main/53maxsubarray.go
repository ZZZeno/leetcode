package main


func maxSubArrayN2(nums []int) int {
	max := nums[0]
	for i := 0; i < len(nums); i ++ {
		for j := i+1; j <= len(nums); j ++ {
			if max < sumN2(nums[i: j]) {
				max = sumN2(nums[i: j])
			}
		}
	}
	return max
}


func sumN2(nums []int) int {
	sum := 0
	if len(nums) == 1 {
		return nums[0]
	}
	for _, num := range nums {
		sum += num
	}
	return sum
}

func maxSubArray(nums []int) int {
	max := nums[0]
	if len(nums) == 1 {
		return nums[0]
	}
	curSum := 0
	for i := 0; i < len(nums); i ++ {
		if nums[i] >= 0 {
			if curSum < 0 {
				curSum = 0
			}
			curSum += nums[i]
		}

		if nums[i] < 0 {
			if curSum < 0 {
				curSum = 0
			}
			curSum += nums[i]
		}
		if curSum > max {
			max = curSum
		}
	}
	return max
}
