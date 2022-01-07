package Part_1_Basics

object Functions extends App {

  def concat(a: String, b: Int): String = a + " " + b
  println(concat("Hello", 25))

  /*
  A function without parantheses must be called without parantheses.
  A function with parantheses must be called with parantheses. But we can call it without parantheses also.
   */
  def aFunctionWithoutParantheses: Int = 421
  println(aFunctionWithoutParantheses)

  def aFunctionWithParantheses(): Int = 420
  println(aFunctionWithParantheses())

  // Use Recursive function instead of loops

  def aRepeatedFunction(string: String, n: Int): String = {
    if (n == 1) string
    else string + aRepeatedFunction(string, n-1) // Recursive method needs return type
  }
  println(aRepeatedFunction("Hello ", 5))

  // Exercise

  def greet(name: String, age: Int):String = s"Hi my name is $name and I am $age years old."
  println(greet("David", 15))

  def aFactorial(n: Int): Int = {
    if (n == 1) 1
    else n * aFactorial(n-1)
  }
  println(aFactorial(5))

  def aFibonacci(n: Int): Int = {
    if (n <= 1) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
  }
  println(aFibonacci(5))

  /*
  def isPrime(n: Int): Boolean = {
    def isPrimeTill(until: Int): Boolean = {
      if(n <= 1) true
      else (n % until !=0 && isPrimeTill(until -1))

    }
    isPrimeTill(n/2)
  }
  println(isPrime(8))

   */
}
