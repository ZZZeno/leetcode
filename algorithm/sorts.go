package algorithm

func InsertionDescSort(arr []int){
	length := len(arr)
	j := 2
	if length <= 1 {
		return
	}
	if length == 2 {
		if arr[0] < arr[1] {
			arr[0], arr[1] = arr[1], arr[0]
			return
		}
	}
	for ; j < length; j ++ {
		key := arr[j]
		i := j-1
		for ; i >= 0 && arr[i] < key; i-- {
			arr[i+1] = arr[i]
		}
		arr[i+1] = key
	}
}
