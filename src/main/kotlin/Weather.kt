class Weather(var temperature: Float?, var lieu : String?) {

    // constructeur qui prend en obj Weather et copie les champs
    constructor(weather : Weather) :this(weather.temperature , weather.lieu)

    fun display() {
        println(lieu + " " + temperature)
    }

    operator fun get(lieu: String?): String {
        return "lieu : " + this.lieu
    }

}