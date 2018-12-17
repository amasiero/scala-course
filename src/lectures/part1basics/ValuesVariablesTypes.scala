package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Vals sao imutaveis. Similares as constantes e finals (C e Java)
  val x : Int = 42
  println(x)

  // A tipagem em Scala é opcional. O compilador infere o tipo.
  // Se informar o tipo de maneira explicita o compilador acusará um erro
  // quando este estiver errado
  val y = 42
  println(y)

}
