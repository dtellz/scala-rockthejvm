package part1Basics

object StringOperations extends App {

  val str: String = "Hello I am learning Scala"

  println(str.charAt(2))
  println(str.substring(2, 11)) // Beginning index is inclusive and end index is exclusive
  println(str.split(" ").toList) // returns an array of elements separated by " " converted to List for printeability
  println(str.startsWith("Hello")) // return boolean if starts with
  println(str.replaceAll("e", "3")) // returns "H3llo I am l3arning Scala"
  println(str.toLowerCase()) // all lowered
  println(str.length) // return the length of the string

  val aNumberString = "45"

  val aNumber = aNumberString.toInt // converts strings to ints

  println(aNumber)
  println('a' +: aNumberString :+ 'z')
  println(str.reverse) // reverses the string
  println(str.take(4)) // prints Hell, synonym for substring(0, x)

  /*
    String Interpolators:
   */

  // S-interpolators
  val name = "Jeff"
  val age = 23
  val greeting = s"Hello, my name is $name and I am $age years old" // allows adding vars to a string if prefaced with s"
  val lastYearGreeting = s"Hello, my name is $name and I am ${age - 1} years old"
  println(lastYearGreeting)

  //F-interpolators (formatting the output)
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.3f burgers per min" // %2.3f means "at least 2 characters with 3 float points
  println(myth)

  //Raw interpolator
  println(raw"This is a \n newline ")
  val escaped = "This is a \n newline "
  println(raw"$escaped")




}
