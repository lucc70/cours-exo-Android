fun main(args: Array<String>) {

    // premier weather avec le constructor par defaut implictement créé
    //Weather(13.21f, " Bordeaux").display()

    // deuxieme weather avec le constructeur qui prend un obj weather
    //Weather(Weather(30f," Rio")).display()

    //Weather(5f, " Lyon").get("Lyon")
    println(Weather(5f, " Lyon").toString())

}

