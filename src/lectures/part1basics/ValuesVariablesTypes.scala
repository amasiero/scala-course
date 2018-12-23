package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Vals sao imutaveis. Similares as constantes e finals (C e Java)
  val x: Int = 42
  println(x)

  // A tipagem em Scala é opcional. O compilador infere o tipo.
  // Se informar o tipo de maneira explicita o compilador acusará um erro
  // quando este estiver errado
  val y = 42
  println(y)

  // Strings são declaradas com valores entre aspas duplas
  // ponto e virgula são permitidos em Scala, porém não são necessários
  val aString: String = "Hello";

  val aBoolean: Boolean = true // or false

  // Caracteres são valores de um único elemento entre aspas simples
  val aChar: Char = 'a'

  // São números inteiros com 2 bytes de tamanho
  val aShort: Short = 4613

  // São números interos com 8 bytes de tamanho
  // necessário finalizar com a letra L no final
  val aLong: Long = 5367123398123123121L

  // números do tipo float precisam ser finalizados com a letra f ao final
  val aFloat: Float = 3.14f

  val aDouble: Double = 3.14

  //VARIÁVEIS são definidas com a palavra chave var ao inicio de sua declaração
  var aVariable: Int = 4

  // Diferente de vals uma variavel pode receber um novo valor para armazenar
  aVariable = 5 // Variáveis em programação funcional possuem efeitos laterais

}
