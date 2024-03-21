class Predmeti : Registracija {
    val listaPredmeta = mutableListOf<Predmet>()

    override fun registrujStudenta(student: Student, predmet: Predmet) {
        println("Student ${student.ime} ${student.prezime} je uspesno prijavljen na predmet ${predmet.nazivPredmeta}")
        student.predmeti.plusElement(predmet)
    }

    override fun odjaviStudenta(student: Student, predmet: Predmet) {
        println("Student ${student.ime} ${student.prezime} je uspesno odjavljen sa predmeta ${predmet.nazivPredmeta}")
        student.predmeti.minus(predmet)
    }
}

fun main() {
    
    // 5. Kreiranje nekoliko predmeta
    val predmet1 = Predmet("CS330", "Razvoj mobilnih aplikacija", 8, 4, true)
    val predmet2 = Predmet("CS101", "Uvod u programiranje", 6, 1, true)
    val predmet3 = Predmet("CS450", "Baze podataka", 7, 3, true)

    // 6. Kreiranje nekoliko studenata
    val student1 = Student("123456", "Pera", "Peric", emptyList())
    val student2 = Student("654321", "Mika", "Mikic", emptyList())
    val student3 = Student("111222", "Ana", "Anic", emptyList())

    // 7. Inicijalizacija klase Predmeti i dodavanje predmeta
    val predmeti = Predmeti()
    predmeti.listaPredmeta.addAll(listOf(predmet1, predmet2, predmet3))

    // Dodavanje studenata na random predmete
    predmeti.registrujStudenta(student1, predmet1)
    predmeti.registrujStudenta(student2, predmet2)
    predmeti.registrujStudenta(student3, predmet3)

    // Odjavljivanje studenata sa random predmeta
    predmeti.odjaviStudenta(student1, predmet1)
    predmeti.odjaviStudenta(student2, predmet2)
    predmeti.odjaviStudenta(student3, predmet3)
}