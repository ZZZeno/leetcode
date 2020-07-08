package main

func lengthOfLastWord(s string) int {
	length := len(s)
	if length == 0 {
		return 0
	}
	lolw := 0
	flag := false
	for i := range s {
		if !flag {
			if string(s[length-1-i]) == " " {
				continue
			}
		}
		flag = true
		if string(s[length-1-i]) == " " {
			break
		}
		lolw += 1
	}
	return lolw
}
