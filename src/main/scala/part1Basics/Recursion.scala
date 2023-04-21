package part1Basics
import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if(n<=1)1
    else {
      println("Computing factorial o " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " +n)
      result
    }

  // println(factorial(5000)) // StackOverflow

  def anotherFactorial(n: Int): BigInt = {
    @tailrec // This annotation tells the compiler that this function is meant to be tail recursive otherwise compile errors
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x*accumulator) // TAIL RECURSION = use recursive call as the LAST expression to avoid StackOverflow errors

    factHelper(n, 1)
  }

  println(anotherFactorial(5000)) // Will run thanks to TAIL RECURSION

  // When we need LOOPS in Scala, we need to use TAIL_RECURSION

  /**
   * ASSIGNMENTS as tail recursive:
   *  1. Concatenate a string n times
   *  2. isPrime function tail recursive
   *  3. fibonnacci function tail recursive
   */
  // 1 -
  @tailrec
  def concatenateN(word: String, n: Int, accumulator: String): String = {
    val newWord = accumulator + word
    if (n == 0) accumulator
    else concatenateN(accumulator, n -1, newWord)
  }
  println(concatenateN("Test-", 5, ""))

  // 2. -
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(i: Int): Boolean = {
      if (i <= 1) {
        false
      } else if (n % i == 0) {
        false
      } else if (i == 2) {
        true
      } else {
        isPrimeHelper(i - 1)
      }
    }

    isPrimeHelper(Math.sqrt(n).toInt)
  }

  // -3:
  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboHelper(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboHelper(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboHelper(2, 1, 1)
  }

  println(fibonacci(8))

}
