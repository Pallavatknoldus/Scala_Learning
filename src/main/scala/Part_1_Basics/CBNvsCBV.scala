package Part_1_Basics

object CBNvsCBV extends App {

  def callByName(n: => Long) = {  // "=>" It passes an expression which is evaluated at the time of execution.
    println("By Name : " + n)
    println("By Name : " + n)
  }

  def callByValue(n: Long) = { // Where as in this case, It evaluates a value then the value is being passed as an argument.
    println("By Name : " + n)
    println("By Name : " + n)
  }

  callByName(System.nanoTime())
  callByValue(System.nanoTime())



}
