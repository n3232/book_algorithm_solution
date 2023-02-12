// https://kotlinlang.org/docs/competitive-programming.html#more-tips-and-tricks
fun main(args: Array<String>) {

    val (n, k) = readInts()
    println(listOf("a", "b").joinToString("\n")) // each element of array/list of a separate line
}

//private fun readStr() = readln() // string line
//private fun readInt() = readStr().toInt() // single int
//private fun readStrings() = readStr().split(" ") // list of strings
//private fun readInts() = readStrings().map { it.toInt() } // list of ints

//private fun readStr() = readln() // string line
private fun readInt() = readln().toInt() // single int
private fun readStrings() = readln().split(" ") // list of strings
private fun readInts() = readln().split(" ").map { it.toInt() } // list of ints

//ansを少なくともcount以下になるよう強制する
//ans = ans.coerceAtMost(count)