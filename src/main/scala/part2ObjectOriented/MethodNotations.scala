package part2ObjectOriented
import scala.language.postfixOps

object MethodNotations extends App {
  // class created inside the object to avoid conflict with last lecture Person class
  class Person (val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}, what the heck?!" // prefix notation
    def isAlive: Boolean = true // postfix notation
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie" // the apply() parenthesis are fundamental
  }

  val mary = new Person("Mary", "Inception")

  // infix notation || operator notation (syntactic sugar)
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent method calling

  // "operators" in Scala

  val tom = new Person("Tom", "Fight Club")

  println(mary hangoutWith tom)
  println(mary.hangoutWith(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS
  // ctrl + space after the dot in an object will let you see all available methods for that object

  // Prefix notation:
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ ! -> see unary_! method defined in class Person
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive) // only available for methods without parameters and requires to import scala.language.postfixOps

  // special method apply
  println(mary.apply())
  println(mary()) // it lets you use the object Person as if it was a function
}
