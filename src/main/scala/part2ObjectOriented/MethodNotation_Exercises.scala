package part2ObjectOriented
import scala.language.postfixOps
object MethodNotation_Exercises extends App {

  /**
   * Exercise 1:
   *  Overload the + operator
   *  mary + "the rockstar" => new Person with name "Mary (the rockstar)" and same movie
   *
   * Exercise 2:
   *  Add an age to the Person class that defaults to 0
   *  Add a unary + operator => ne person with the age + 1
   *    +mary => mary with the age incremented
   *
   * Exercise 3:
   *  Add a "learns" methos in the Person class => Mary learns $Scala
   *  Add a learnScala method, calls the learns method with "Scala" as parameter
   *  Use it in postfix notation
   *
   * Exercice 4:
   *  Overload the apply method to behave like:
   *    mary.apply(2) => "Mary watched Inception 2 times"
   */

  class Person(val name: String, val favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}, what the heck?!" // prefix notation
    def isAlive: Boolean = true // postfix notation
    // def apply(): String = s"Hi, my name is $name and I like $favoriteMovie" // the apply() parenthesis are fundamental
    // Exercise 1:
    def +(nickName: String): Person = new Person(s"$name ($nickName)", favoriteMovie)
    // Exercise 2:
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    // Exercise 3:

    def learns(language: String): String = s"$name learns $language"
    def learnsScala: String = this learns "Scala"

    // Exercise 4:
    def apply(times: Int): String = s"$name has seen $favoriteMovie $times times"
  }

  val mary = new Person("Mary", "Inception")

  // Exercise 1:
  val maryNicknamed = mary + "the rockstar"
  println(maryNicknamed.name)
  println(maryNicknamed.favoriteMovie)

  // Exercise 2:
  val olderMary = +mary
  println(olderMary.age)

  val evenOlderMary = +olderMary
  println(evenOlderMary.age)

  // Exercise 3:
  println(mary.learns("Python"))
  println(mary learnsScala)

  // Exercise 4:
  println(mary(2))

}
