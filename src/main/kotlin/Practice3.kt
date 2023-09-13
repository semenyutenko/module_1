// task_6
fun main() {
    try {
        println("Enter the number 'a' :")
        val a = readln().toInt()
        println("Enter the number 'b' :")
        val b = readln().toInt()
        println("$a is bigger than $b, it is ${compare(a, b)}" )
    } catch (e: Exception) {
        println("You're making me crazy! I've had enough!")
    }
}

fun compare(a: Int, b: Int): Boolean {
    return a > b
}