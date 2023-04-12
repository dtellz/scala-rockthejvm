package part1Basics

object ValuesVariablesTypes extends App {
  val x: Int = 42;

  println(x);

  // VALS are inmutable! cant reassign x = 2

  // COMPILER can infer types

  val aString: String = "hello"
  val aBoolean: Boolean = true
  val aChar: Char = 'c'
  val aShort: Short = 4613 // 2 bytes integer
  val aInt: Int = 1212312312 // 4 bytes integer
  val aLong: Long = 1131231231231231232L // 8 bytes integers
  val aFloat: Float = 0.2f
  val aDouble: Double = 0.2

  // Variables:

  var aVariable: Int = 4
  // vars are mutable, we can reassign values at the cost of side effects
  aVariable = 5
}
