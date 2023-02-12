fun main(args: Array<String>) {
    val (N, v) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }

    // 線形探索
    var counter = 0
    for (aaa in a) {
        if (aaa == v) {
            counter++
        }
    }
    println(counter)
}

