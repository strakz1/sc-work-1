package cz.etn.scwork

case class Address()

/**
 * @author Radek Beran
 */
class Person(val firstName: String, val lastName: String) {
  // Tady v tele je implementace konstruktoru
  1 + 3 // v konstruktoru
  println("Constructing Person")

  // val firstName: String // uz mame
  // def firstName: String = firstName

  // a jsou tu i cleny tridy
  def fullName(): String = firstName + " " + lastName
}

case class SimplePerson(firstName: String, lastName: String) {
  // Tady v tele je implementace konstruktoru
  // 1 + 3 // v konstruktoru
  println("Constructing Person")

  // val firstName: String // uz mame
  // def firstName: String = firstName

  // a jsou tu i cleny tridy
  def fullName(): String = firstName + " " + lastName
}

