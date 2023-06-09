package part2ObjectOriented


abstract class MyList[+A] {
  /*
        head = first element of the list
        tail = remainder of the list
        isEmpty = is this list empty
        add(int) => new list with this element added
        toString => a string representation of the list
     */
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElements: String
  // Polymorphic call
  override def toString: String = "["+ printElements + "]"
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A]{
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B >: A](element: B): MyList[B] = new Cons(element, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
  // def add(element: Int): MyList[Int] = new Cons(element, Empty)
  def printElements: String = ""
}

/*object Inheritance_exercises extends App {

  val list = new Cons(2, new Cons(3, Empty))

  println(list.tail.head)
  println(list.add(4).head)

  // Polymorphic call
  println(list.toString)

}*/

object ListTest extends App {
  val listOfIntegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listOfStrings: MyList[String] = new Cons("uno", new Cons("dos", new Cons("tres", Empty)))

  println(listOfStrings)
  println(listOfIntegers)
}
