package part2ObjectOriented

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit = println("SCALA ROCKS")
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("LOL")
  }

  // println(funnyAnimal.getClass)
  println(funnyAnimal.eat)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi my name is ${name}")
  }

  val jim = new Person ("Jim"){
    override def sayHi: Unit = println("Hi my name is Jim, can I help?")
  }

  println(jim.sayHi)
}
