package part1Basics

object DefaultArgs extends App {

  def trFact (n: Int, accumulator: Int = 1): Unit = {
    if (n <= 1) accumulator
    else trFact(n-1, n*accumulator)
  }

  val fact10 = trFact(10, 1)

  println(s"factorial of 10 $fact10")

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")

  savePicture(width = 400)
}
