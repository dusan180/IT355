data class Predmet(
    val sifraPredmeta: String,
    val nazivPredmeta: String,
    val brojEspbPoena: Int,
    val semestar: Int,
    val obavezan: Boolean
) {
    override fun toString(): String {
        val obavezanStr = if (obavezan) "(obavezan)" else "(izborni)"
        return "$sifraPredmeta-$nazivPredmeta ESP:$brojEspbPoena semestar:$semestar $obavezanStr"
    }
}