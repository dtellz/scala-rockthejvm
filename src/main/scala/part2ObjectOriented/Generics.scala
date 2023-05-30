package part2ObjectOriented

object Generics extends App {
  // Generic class -> will work with any type
  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Animal

     */
  }

  // You can add as many type parameters as we like. Here key and value can be of any desired type
  class MyMAp[key, value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings  = new MyList[String]

  // Generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1 -> List[Cat] extends List[Animal] -> COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ?? will return a list of Animals

  // 2 -> INVARIANCE
  class InvariantList[A]
  val invariantAnimal: Animal = new Cat
  // ERROR -> val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3 -> CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // Bounded types -> will only accept Animal types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog) // Accepts Dog because its an instance of Animal

  class Car
  // val newCar = new Cage(new Car) // Will break

  // EXERCISE -> Expand MyList to be generic

}
