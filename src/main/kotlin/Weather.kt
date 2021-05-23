class Weather(var temperature: Float?, var lieu : String?) {

    // constructeur qui prend en obj Weather et copie les champs
    constructor(weather : Weather) :this(weather.temperature , weather.lieu)
    val seuilZero = 0;
    val seuilChaud = 25f;

    fun display() {
        println(lieu + " " + temperature)
    }

    fun get(lieu: String?) : String{
        println( "lieu :");
        return "lieu : " + this.lieu
    }

    override fun toString(): String {
        return "Temperature de $lieu : $temperature "
    }

    fun isCold (): String {
        if (this.temperature!! < seuilZero) {
            return "Il fait moins de Zero degrè, donc Oui";
        } else if (this.temperature!! > seuilZero) {
            return "Il fait plus de Zero degrè, donc non"
        }
        return "il fait Zero degrè, Donc je sais pas...";
    }


    fun isHot (): String {
        if (this.temperature!! < seuilChaud) {
            return "Il fait moins de 25 degrès, donc non pas trop chaud";
        } else if (this.temperature!! == seuilChaud) {
            return "Il fait 25 degrès, donc Oui"
        }
        return "Il fait plus de 25 degrès, donc Oui très";
    }

}