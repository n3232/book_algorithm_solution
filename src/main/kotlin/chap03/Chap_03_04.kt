fun main(args: Array<String>) {
    // N 個の値の「最大値」と「最小値」を求めます。それらの差が求める値となります。計算量は O(N) です。
    val N = readln().toInt()
    val A = readln().split(" ").map { it.toInt() }
    val max = A.max()
    val min = A.min()
    println(max - min)
}

