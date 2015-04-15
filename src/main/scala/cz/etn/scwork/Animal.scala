package cz.etn.scwork

/**
 * @author Radek Beran
 */
class Animal(legCount: Int, val age: Int, private val name: String) {

  val legAgeCoef: Int = legCount * age // val - stejne se nemeni

  def run(direction: Option[Int]): Unit = {} // () kdyz se vevnitr manipuje se stavem, slozitejsi vypocet apd.
  // val run: Unit

  def fullName: String = name + "?" // bez () kdyz se jednoduse neco vraci, nenarocna operace nemenici stav

  private def inner(name: String): String = "Hello " + name

  // settery tu nejsou
}

object AnimalRepo {
  // singleton repo
  def findById(animalId: Int): Option[Animal] = {
    val ret = if (animalId == 2) Some(new Animal(2, 4, "Zvire"))
    else None
    ret
  }

  def findByName(name: String): Option[Animal] =
    if (name == "Azor") Some(new Animal(4, 4, "Azor"))
    else None
}

object AnimalRepoUsage {
  def process(): Unit = {
    val animalOpt = AnimalRepo.findById(3)
    animalOpt.isDefined
  }
}
