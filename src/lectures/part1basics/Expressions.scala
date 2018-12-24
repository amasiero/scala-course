package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expressions : são cálculos que resultem em um valor
  println(x)

  // operadores matematicos
  // + - * /
  // & (E)
  // | (OU)
  // ^ (XOR)
  // << (left shift)
  // >> (right shift)
  // >>> (right shift with zero extension)
  println(2 + 3 * 4)

  // operadores relacionais
  // == != > >= < <=
  println(1 == x)

  //operadores lógicos
  // ! && ||
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // funciona com -= *= /= (operadores que funcionam apenas com variaveis)
  println(aVariable)

  // Intructions vs Expressions
}
