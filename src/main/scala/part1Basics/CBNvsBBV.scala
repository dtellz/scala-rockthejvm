package part1Basics

object CBNvsBBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: ", + x)
    println("by value: ", + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: ", +x)
    println("by name: ", +x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  /*
  Printed values:
  calledByValue(System.nanoTime())
    (by value: ,310436455763028)
    (by value: ,310436455763028)

  calledByName(System.nanoTime())
    (by name: ,310668791365710)
    (by name: ,310668791412684)


  EXPLANATION:
    1.- Value  is computed before call
    2.- Same value used everywhere
    def calledByValue(x: Long): Unit = {
    println("by value: ", + ,310436455763028)
    println("by value: ", + ,310436455763028)
    }

    1.- Expression is passed literally
    2.- Expression is evaluated at every use within
    def calledByName(x: => Long): Unit = {
      println("by name: ", + System.nanoTime())
      println("by name: ", + System.nanoTime())
    }
   */
}
