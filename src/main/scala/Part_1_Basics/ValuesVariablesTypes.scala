package Part_1_Basics

object ValuesVariablesTypes extends App {

  // VALUES -> Immutable

  val x: Int = 45
  println (x)

  // x = 2 vals are immutable

  val y = 45 // Types are optional, Compiler can infer types automatically
  println(y)

  val aString: String = "Hello All" // semicolons are important to separate the expression, if two or more than two expressions are written in same line.
  println(aString)

  // TYPES

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 8787
  val aLong: Long = 45784157845L
  val aFloat: Float = 2.5f
  val aDouble: Double = 45.78

  // VARIABLES -> Mutable

  var a: Int = 12  // Side Effect
  a = 15
  println(a)
}
