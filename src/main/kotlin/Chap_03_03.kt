fun main(args: Array<String>) {
    val N = readln().toInt()
    val A = readln().split(" ").map { it.toInt() }

    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE
    // 線形探索
    for (a in A) {
        if (a < smallest) {
            secondSmallest = smallest
            smallest = a
        } else if (a < secondSmallest) {
            secondSmallest = a
        }
    }
    println(secondSmallest)
}

