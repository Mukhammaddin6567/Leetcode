package leetcode

fun main() {
    val temp: IntArray = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    twoSum(temp, 8)
}

private fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.size == 2) return intArrayOf(0, 1)

    for (i in nums.indices) {
        for (j in i + 1..<nums.size) {
            if (nums[i] + nums[j] == target) {
                println("$i; $j")
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf(0, 0)
}