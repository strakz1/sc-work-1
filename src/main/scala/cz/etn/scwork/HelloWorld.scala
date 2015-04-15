package cz.etn.scwork

// Radsi do samostatneho souboru
class Dog


object HelloWorld { // object - singleton instance

  def plus(a: Int, b: Int): Int = { // v public metodach navrat. typ psat, aby bylo rozhrani jasne
    // 1 + 4
    a + b
  }

  // one-liner
  def minus(a: Int = 3, b: Int = 0): Int = a - b

  def myPrint(a: Int, b: Int): Unit = println(a - b)

  def neco(a: Int, b: Int) { a + b } // syntaxe bez = vraci vzdy Unit
  def lepsiNeco(a: Int, b: Int): Int = { a + b }

  def main(args: Array[String]): Unit = {
    val pepa = new Person("Pepa", "Z depa")
    pepa.firstName
    println(pepa.toString)

    minus(b = 3, a = 6) // lepsi nez neco(true, true, false, false, false, 1, 3, true)
    // println("Chyba pri kompilaci: " + minus(3, a = 6))
    println("Lepsi: " + minus(3, b = 6))
    println("Default b = 0: " + minus(4))

    val mirek = SimplePerson("Mirek", "Dusin")
    println("Mira: " + mirek)
    val jirka = mirek.copy(firstName = "Jirka")
    println("Jirka: " + jirka)

    val (firstNameExtracted, lastNameExtracted) = mirek

    val alik = new Animal(4, 10, "Alik")
    alik.run(None)

    val up: Unit = println(plus(1, 2))
    val res: Unit = myPrint(1, 2)
    println(res.+("aaa"))
    println("Neco: " + neco(2, 4))

    // val u: Unit = ()

    val id: Int = 12; // ; neni potreba
    val id2 = 12
    val id3: Int = 12; val id4: Int = 12

    // id = 5 // nelze

    var promenna = 4
    promenna = 5

    val name = "Pepa"
    val name2: Any = "Pepa"
    val name3: AnyRef = "Pepa"
    val name4: AnyVal = 3 // String nejde "Pepa"

    val idAsShort = 1.toShort

    val a: java.lang.Integer = new Integer(20)
    val b: Int = new Integer(30)
    val d = 20.1d

    val numA = 1.+(2)
    val numB = 1 + 3
    // Alt + "=" napovida typ

    val numC = 1 + 3 * 2

    println("Hello world, number " + numC)
  }

}
