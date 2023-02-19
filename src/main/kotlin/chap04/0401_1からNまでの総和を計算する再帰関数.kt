package chap04

fun main() {

    println(func(5))

}

// 1からNまでの総和を計算する再帰関数
fun func(n: Int): Int {
    if (n == 0) return 0
    return n + func(n - 1)
}