package part1basics

object Functions extends  App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hell0", 3))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)

  }
  println(aRepeatedFunction("hello", 3))
}
