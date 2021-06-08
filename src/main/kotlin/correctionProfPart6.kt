package com.g123k.myapplication

fun main() {

    val weather = object : LocalWeather(
        30f, "Paris")
    {
        override fun isHot(): Boolean = temp > 40f
    }

}

class Weather(val temp: Float, val location: String) {

    constructor(weather: Weather) :
            this(weather.temp, weather.location)

}

open class Weather1(val temp: Float, private val localLocation: String) {

    companion object {
        private const val MIN_TEMP = 0f
        private const val MAX_TEMP = 25f
    }

    val location: String
        get() {
            return "Lieu : $localLocation"
        }

    constructor(weather: Weather1) : this(weather.temp, weather.location)

    fun isCold() = temp < MIN_TEMP
    fun isCold1(): Boolean {
        return temp < MIN_TEMP
    }

    open fun isHot() = temp > MAX_TEMP

    override fun toString(): String {
        return "Température de $location : $temp"
    }

}

open class LocalWeather : Weather1 {

    companion object {

        private const val MAX_TEMP = 32

    }

    constructor(temp: Float, location: String) : super(temp, location)
    constructor(localWeather: LocalWeather) : super(localWeather.temp, localWeather.location)

    override fun isHot(): Boolean = temp > MAX_TEMP

}

class User {

    // 6) Equivalent de static
    companion object {
        fun hello() {
            println("Hello World")
        }
    }

}