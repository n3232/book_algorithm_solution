package chap04

fun main() {
    val ans = gcd(51, 15) // (51,15) -> (15,6) -> (6,3) -> (3,0) -> 3
    println(ans)

}

fun gcd(m: Int, n: Int): Int {
    if (n == 0) return m
    return gcd(n, m % n)
}