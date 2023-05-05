package part2ObjectOriented

object OO_Exercises extends App {

  val writerOne = new Writer("JRR", "Tolkien", 1945)

  val tlotr1 = new Novel("The Hobbit", 1975, writerOne)
  val tlotr2 = tlotr1.copy(1978)

  println(writerOne.fullName)
  println(tlotr1.authorAge)
  println(tlotr1.isWrittenBy)
  println(tlotr2.authorAge)
  println(tlotr2.isWrittenBy)

  // ==============

  val counter = new Counter(5)

  val firstOp = counter.decrement
  println(firstOp.currentCount)
  val secondOp = firstOp.increment
  println(secondOp.currentCount)
  val thirdOp = secondOp.increment(firstOp.currentCount)
  println(thirdOp.currentCount)
  val fourthOp = thirdOp.decrement(secondOp.currentCount)
  println(fourthOp.currentCount)

}
/*
  Exercises:
   1.-  create a class Novel and a class Writer

    Writer: first name, surname, year
    - method fullname
    Novel: name, year of release, author
    -methods:
      -authorAge -> returns the age of the author at year of release
      -isWrittenBy(author) -> sets the author
      -copy (new year of release) = new instance of Novel with a new year of release
*/
class Writer(firstName: String, surname: String, val year: Int) {
  def fullName = firstName + " " + surname
}

class Novel(name: String, releasedYear: Int, author: Writer) {
  def authorAge = releasedYear - author.year

  def isWrittenBy: String = author.fullName

  def copy(year: Int) = new Novel(this.name, year, this.author)
}

/*
  2.- Counter class
      - receives an int value
      - method current count
      - method to increment/decrement by 1 that returns a new counter
      - overload inc/dec to receive an amount
 */

class Counter(n: Int) {
  def currentCount = n
  def increment = new Counter(n + 1)
  def increment(n: Int) = new Counter(this.n + n)
  def decrement = new Counter(n - 1)
  def decrement(n: Int) = new Counter(this.n - n)

}