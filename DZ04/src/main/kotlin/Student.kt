data class Student(
    val index: String,
    val ime: String,
    val prezime: String,
    val predmeti: List<Predmet>
) {
    override fun toString(): String {
        return "$index $ime $prezime"
    }
}