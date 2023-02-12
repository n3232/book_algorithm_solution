fun main(args: Array<String>) {
    val (k, n) = readLine()!!.split(" ").map { it.toInt() }
    var count = 0

    for (x in 0..k) {
        for (y in 0..k) {
            val x = n - x - y
            if (x in 0..k) count++
        }
    }
    println(count)
}

