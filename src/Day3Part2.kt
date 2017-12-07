import java.util.*

fun main(args: Array<String>) {
    val size = 9
    val field = Array(size, { Array(size, { 0 }) })
    var i = size / 2
    var j = size / 2
    field[i][j] = 1
    i++
    while (i >= 0 && j >= 0 && i < size && j < size) {

        // set value
        if (j != 0) {
            field[j][i] += field[j - 1][i]
            if (i != 0)
                field[j][i] += field[j - 1][i - 1]
            if (i != size - 1)
                field[j][i] += field[j - 1][i + 1]
        }
        if (j != size - 1) {
            field[j][i] += field[j + 1][i]
            if (i != 0)
                field[j][i] += field[j + 1][i - 1]
            if (i != size - 1)
                field[j][i] += field[j + 1][i + 1]
        }
        if (i != 0)
            field[j][i] += field[j][i - 1]
        if (i != size - 1)
            field[j][i] += field[j][i + 1]
        println("$j, $i")
        field.forEach { par ->
            println(Arrays.toString(par))
        }
        // take step
        if (i == 0 || field[j][i - 1] != 0) {
            if (j != 0 && field[j - 1][i] != 0)
                i++
            else
                j--
        } else if (i < size - 1 && field[j][i + 1] != 0) {
            if (j < size - 1 && field[j + 1][i] != 0)
                i--
            else
                j++
        } else if (j == 0 || field[j + 1][i] != 0)
            i--
        else i++


    }
}