fun main(args: Array<String>) {
    /*var aMultiple = 3
    print(multiFive(number = aMultiple))

    // autre manière plus courte
    print(multiFive(aMultiple))*/

    var num = 3
    print("le factoriel de " + num + " est : " + factorielle(num))
}

//Implémenter l'algorithme permettant de calculer la factorielle d'un entier.
fun factorielle (n : Int) : Int {
    if (n>1) {
        return n * factorielle(n-1)
    } else {
        return 1
    }
    return 1
}