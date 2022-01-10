package Part_1_Basics

object TypeInference extends App {

  val number: Int = 5
  val anOtherNumber = 5
  val message = "Hello All, I am smart."
  val add = message + number // add -> String (Int + String)

  def add (n: Int = 5, m: Int = 5) = n + m // scala will take the type of the function automatically, but it should be correct as per right hand side.
  println(add())

}
