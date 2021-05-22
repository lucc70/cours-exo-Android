
//Créez une classe User qui contient deux attributs : nom et prénom
// ceci est un data class
data class User(private var nom: String?, private var prenom: String?) {

    open fun display() {
        println(nom + " " + prenom)
    }
    // on overrive la fun esquals qui renvoit
    /*override fun equals(other: Any?): Boolean {
        return (other as User).nom == nom && (other as User).prenom == prenom
    }*/
}