package part2ObjectOriented

object OOBasics extends App {

  val person = new Person("Jhon", 26)

  println(person.x)

  val person2 = new Person("Sara", 21)

  person.greet(person2.name)
  person2.greet(person.name)

  person.greet()
  person2.greet()

  // leveraging multiple constructor feature (it defaults to age 0 in this cafe)
  val person3 = new Person("Philips")

  println(person3.age)

}
// This is the constructor
class Person (val name: String, val age: Int) {
  // class body
  val x = 2

  println("class creation - this runs in every instantiation of a class")

  def greet(name: String): Unit = println(s"${this.name} says hi $name!")
  // overloading -> its allowed in scala when you use same name for methods but with different signatures
  // meaning different parameters
  def greet(): Unit = println(s"Hi I am $name") // this way name references to this.name

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("Jhon Doe") // auxiliary constructors
}

// Class parameters are not fields. We cant access them as person.age
// unless we declare them as "val" in the constructor

