package part1Basics

object Expressions extends App {
  val x = 1 + 2 // This is an expression in scala
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 10 // also works with -= *= and /= ....... side effects

  println(aVariable)

  // Instructions vs Expressions
  // An instruction is something we tell the computer to do
  // Expressions are something that has a value
  // in Scala we are gonna think always in Expressions and not instructions

  // IF expression
  val aCondition = false
  val aConditionedValue = if (aCondition) 5 else 3 // IF Expression

  println(aConditionedValue)

  // LOOPS
  var  i = 0

  // AVOID WHILE LOOPS! dont use imperative code with Scala, remember everything in Scala is an Expression
  while(i < 10) {
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable = 3) // Type Unit === void . like dont return nothing meaningful

  println(aWeirdValue)

  // side effects: println(), while, reassigning <- expressions that return Unit

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z> 2) "Hello" else "goodbye"
  }

  println(aCodeBlock)
}
