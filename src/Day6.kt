fun main(args: Array<String>) {
    var config = mutableListOf(4, 1, 15, 12, 0, 9, 9, 5, 5, 8, 7, 3, 14, 5, 12, 3)
//    var config = mutableListOf(0, 2, 7, 0)
    var configs = mutableMapOf<MutableList<Int>, Int>()
    var count = 0
    while (!configs.contains(config)) {
        configs.set(config, count++)
        var max = config.max()!!
        val indexOfMax = config.indexOf(max)
        config = config.toMutableList()
        config[indexOfMax] = 0
        for (i in 0 until config.size) {
            config[(indexOfMax - i + config.size) % config.size] += (max / config.size)
            max++
        }
    }
    println(count)
    println(count - configs.get(config)!!)

}