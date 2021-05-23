class Weather(var temperature: Float?, var lieu : String?) {

    // constructeur qui prend en obj Weather et copie les champs
    constructor(weather : Weather) :this(weather.temperature , weather.lieu)
    val seuilZero = 0;

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

}