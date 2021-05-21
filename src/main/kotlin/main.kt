fun main(args: Array<String>) {
    var aMultiple = 3
    print(multiFive(number = aMultiple))

    // autre manière plus courte
    print(multiFive(aMultiple))
}

fun multiFive(number: Int): Int = 5 * number
//⌥⏎