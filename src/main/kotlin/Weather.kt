class Weather(var temperature: Float?, var lieu : String?) {

    // constructeur qui prend en obj Weather et copie les champs
    constructor(weather : Weather) :this(weather.temperature , weather.lieu)

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

    fun isCold (): Boolean {
        if (this.temperature!! < 0) {
            return true;
        }
        return false;
    }

}