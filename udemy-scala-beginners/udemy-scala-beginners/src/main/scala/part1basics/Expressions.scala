package part1basics

object Expressions extends App {
  val x = 1+2 // Expression
  println(x)

  println(2 + 3 * 4)

  //>>> right shift with zero extension
  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3

  println(aVariable)

  //instructions (DO), expression (values or types)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  //bucles
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
  //nerver again
  //everithing on scala is a expression

  val aWeirdValue = (aVariable = 3)

  //unit is void

  print(aWeirdValue)

  //code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z>2) "hello" else "goodbye"
  }

  
}
