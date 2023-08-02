fun main(args: Array<String>) {
    var s = Ackerman(3,3)
    print(s)
}
val memo = mutableMapOf<Pair<Int, Int>, Int>()

    fun Ackerman(m: Int, n: Int): Int{
        val pair = Pair(m, n)
        if (pair in memo) {
            return memo[pair]!!
        }
        var a = 0
        if (m==0) {
            a = n+1
        } else if(m > 0 && n == 0) {
            a = Ackerman(m - 1, 1)
        } else if(m > 0 && n > 0) {
            a = Ackerman(m - 1, Ackerman(m, n - 1))
        }
        memo[pair]=a
        return a
    }

fun AckermanOptimized(){

}