fun main(args: Array<String>) {
    println("Hello World!")

    var HT = 10.00
    var TVA21 = 0.021
    var TVA55 = 0.055
    var TVA10 = 0.10
    var TVA20 = 0.20

    var TTC21 = HT + (HT * TVA21)
    var TTC55 = HT + (HT * TVA55)
    var TTC10 = HT + (HT * TVA10)
    var TTC20 = HT + (HT * TVA20)



    println("Montant Ht : " + HT + "€")
    println("TVA 2,1% : " + TTC21 + "€")
    println("TVA 5,5% : "+ TTC55 + "€")
    println("TVA 10% : "+TTC10 + "€")
    println("TVA 20% : "+TTC20 + "€")
    
}