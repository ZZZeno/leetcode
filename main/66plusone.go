package main

func plusOne(digits []int) []int {
	if len(digits) == 0 {
		return []int{1}
	}
	last := digits[len(digits)-1]
	if last == 9 {
		return append(plusOne(digits[0 : len(digits)-1]), 0)
	}
	return append(digits[0 : len(digits)-1], last+1)
}
