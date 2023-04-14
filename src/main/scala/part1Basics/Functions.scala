package part1Basics

object Functions extends App {
  // We can declare functions as code blocks or directly
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction())
  println(aParameterLessFunction) // You can call functions in Scala 2 without parenthesis

  def aRepeatedFunction(aString: String, n: Int): String   = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  // When we need loops, we are going to use functions

  // We can use Unit as the return type of a function that we want to use to handle side effects
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  def aBigFunction(n: Int): Int = {
  def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }
  /* EXERCISES
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. A factorial function: 1 * 2 * 3 * ... * n
    3. A fibonacci function that will receive n and return the absolute value of the n number
        f(1) = 1
        f(2) = 1
        f(n) = f(n-1) + f(n-2)
    4. A function that tests if a number is prime
   */

  // 1:
  def aGreetingFunction(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }

  println(aGreetingFunction("Diego", 36))

  // 2:

  var prevValue = 1
  def aFactorialFunction(n: Int): Int = {
    println(s"called $prevValue")
    if (n == 1) prevValue
    else {
      prevValue *= n
      println(s"computed $prevValue")
      aFactorialFunction(n - 1)
    }
  }

  println(aFactorialFunction(4))

  // 3:


}
