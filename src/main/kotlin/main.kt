fun main(args: Array<String>) {

    // utilisation possible du comparateur == plus besoin de la fun equals quand c'est une data class
    println("sont ils égaux ? " + (User("smith", "toto") == User("smith", "toto")))
    User("titi","tata").display()
}

