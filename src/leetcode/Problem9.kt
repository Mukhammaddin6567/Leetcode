package leetcode

fun main() {
    println(isPalindrome(121))
//    println(isPalindrome(1212))
}

private fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    if (x == 0) return true

    var reversedNumber = x
    var sum = 0

    while (reversedNumber != 0) {
        val restNumber = reversedNumber % 10
        sum = (sum * 10) + restNumber
        reversedNumber /= 10
    }

    return sum == x
}