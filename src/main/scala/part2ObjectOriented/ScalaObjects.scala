package part2ObjectOriented

object ScalaObjects extends App {

  // Scala does not have class-level functionality ("static")
  object Person { // Scala Objects are singletons by design
    val N_EYES = 2
    def canFly: Boolean  = false

    def apply(father: Person, mother: Person): Person = new Person("Bobbie")
  }

  class Person (val name: String) {
    // Instance level funcionality
  }
  // Defining an object and a class of the same name is called COMPANIONS in Scala

  val mary = new Person("Mary")
  val john = new Person("John")

  println(mary == john) // Created as classes

  val per1 = Person
  val per2 = Person

  println(per1 == per2) // Singleton

  val son = Person(mary, john)

  println(son.name)

  // Scala applications are basically a Scala


}
