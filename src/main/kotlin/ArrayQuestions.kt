class ArrayQuestions {

    //Question No:01
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1


        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]
                i--
            } else {
                nums1[k] = nums2[j]
                j--
            }
            k--
        }

        while (j >= 0) {
            nums1[k] = nums2[j]
            j--
            k--
        }
    }


    //Question No:02
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val resultList = mutableListOf<Int>()

        if (nums.size in 0..100) {
            nums.forEach { numbers ->
                if (numbers in 0..100) {
                    if (numbers != `val` && `val` in 0..100) {
                        resultList.add(numbers)
                    }
                }
            }

        }

        return resultList.size
    }

//    fun removeElement(nums: IntArray, `val`: Int): Int {
//        var k = 0
//        for (i in nums.indices) {
//            if (nums[i] != `val`) {
//                nums[k] = nums[i]
//                k++
//            }
//        }
//
//        return k
//    }


    //Question No:03

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var k = 0
        for (i in 1 until nums.size) {
            if (nums[i] != nums[k]) {
                k++
                nums[k] = nums[i]
            }
        }

        return k + 1
    }


}