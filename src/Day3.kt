import java.lang.Math.abs

fun main(args: Array<String>) {
    val input = 361527
    var squareSize = 1
    while (squareSize * squareSize < input) squareSize += 2
    val order = input - (squareSize - 2) * (squareSize - 2)
    val positionOnTheSide = order % (squareSize - 1)
    println(abs(positionOnTheSide - (squareSize - 1) / 2) + (squareSize - 1) / 2)
}