package algorithm

import (
	"fmt"
	"testing"
)

func TestInsertionDescSort(t *testing.T) {
	testData := []int{5, 2, 4, 6, 3, 1}
	InsertionDescSort(testData)
	fmt.Println(testData)
}