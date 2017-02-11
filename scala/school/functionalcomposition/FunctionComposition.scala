package scala.school.functionalcomposition

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object FunctionComposition {
  def f(s: String): String = "f(" + s + ")"
  def g(s: String): String = "g(" + s + ")"

  def main(args: Array[String]): Unit = {
    //compose
    //compose makes a new function that composes other functions f(g(x))
    val fComposeG = f _ compose g _
    println(fComposeG("yay"))

    //andThen
    //andThen is like compose, but calls the first function and then the second, g(f(x))
    val fAndThenG = f _ andThen g _
    println(fAndThenG("yay"))
  }
}