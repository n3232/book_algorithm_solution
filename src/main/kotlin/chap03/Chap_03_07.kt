fun main(args: Array<String>) {
    val s = readLine()!!.toList().map { it.toString().toInt() }
    val n = s.size
    if (n == 1) {
        println(s[0])
        return
    }
    val bit = (1..n).fold(1) { acc, _ -> acc * 2 } - 1
    (0..bit).map {
        val plus = Integer
            .toBinaryString(it).padStart(n - 1, '0')
            .map { it == '1' }
        val sb = StringBuilder()
        for (i in 0..plus.lastIndex) {
            sb.append(s[i])
            if (plus[i]) sb.append("+")
        }
        sb.append(s.last())
        return@map sb.split("+").map { it.toLong() }.sum()
    }.sum().let { println(it) }
}

