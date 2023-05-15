package part2ObjectOriented

object AbstractDataTypes extends App {

  // Class with undefined methods or properties -> Are meant to be extended afterwards
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }
  // You need to define the undefined properties/methods from the abstract class
  class Dog extends Animal {
    override val creatureType: String ="Canina"
    override def eat: Unit = println("Crunch crunch")
  }

  val test = new Dog()

  // Traits

  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"
    val eat: Unit = "nomnomnom"
    def eat(animal: Animal): Unit = println(s"I am a Croc and I am eating ${animal.creatureType}")
  }

  // Traits VS abstract class
  // 1.- traits can't have constructor parameters
  // 2.- Scala allows multiple trait inheritance but only 1 class inheritance
  // 3.- Traits describe behaviours but abstract classes describe things

}
