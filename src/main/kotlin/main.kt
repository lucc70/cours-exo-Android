fun main(args: Array<String>) {
    /*var aMultiple = 3
    print(multiFive(number = aMultiple))

    // autre manière plus courte
    print(multiFive(aMultiple))*/


    fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
    )
}

// i lfaut rajouter des valeur par defaut au cas ou on decide de ne pas en entrer plus tard
fun foo(name: String, number: Int = 0, toUpperCase: Boolean = true) =
    (if (toUpperCase) name.toUpperCase() else name) + number