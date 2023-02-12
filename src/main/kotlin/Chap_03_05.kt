fun main(args: Array<String>) {
    readln().toInt()
    val A = readln().split(" ").map { it.toInt() }
    var ans = Int.MAX_VALUE

    for (i in A.indices) {
        var a = A[i]
        var count = 0
        while (a % 2 == 0) {
            a /= 2
            count++
        }
        //ansを少なくともcount以下になるよう強制する
        ans = ans.coerceAtMost(count)
    }
    println(ans)
}

