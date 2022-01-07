package Part_1_Basics

object Expressions extends App {

  val add = 1 + 2 // Expression
  println(add)

  println (2 + 9 * 2 - 8) // Mathematical Expression

  println(5 == add)

  println(!(add == 3)) // ! && ||

  var aVar = 3
  aVar += 2
  println(aVar)
  aVar -= 1
  println(aVar)

  // Instruction VS Expressions

  var aCon = 5
  val check = if (aCon == 5) aCon = 10  else aCon = 1
  println(aCon)

  val anOtherCon = true
  val CheckanOtherCon = if (anOtherCon) 5 else 3 // if (anOtherCon) 5 else 3 -> Expression
  println (CheckanOtherCon)

  // Reassigning a Variable is a side effect , Side effects in scala are returning unit
  // Side effects : println(), while, reassigning
  /*
   Code block is an expression
   Value of the code block is its last expression
   */


}
