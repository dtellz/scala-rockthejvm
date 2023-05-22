package part2ObjectOriented


abstract class MyList {
  /*
        head = first element of the list
        tail = remainder of the list
        isEmpty = is this list empty
        add(int) => new list with this element added
        toString => a string representation of the list
     */
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  // Polymorphic call
  override def toString: String = "["+ printElements + "]"
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element, Empty)
  def printElements: String = ""
}

object Inheritance_exercises extends App {

  val list = new Cons(2, new Cons(3, Empty))

  println(list.tail.head)
  println(list.add(4).head)

  // Polymorphic call
  println(list.toString)

}
