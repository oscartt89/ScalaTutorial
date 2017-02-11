package scala.school.functionalcomposition

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object PartialFunctions {
  def main(args: Array[String]): Unit = {
    val one: PartialFunction[Int, String] = { case 1 => "one" }

    println(one.isDefinedAt(1))
    println(one.isDefinedAt(2))

    println(one(1))

    val two: PartialFunction[Int, String] = { case 2 => "two" }
    val three: PartialFunction[Int, String] = { case 3 => "three" }
    val wildcard: PartialFunction[Int, String] = { case _ => "something else" }
    val partial = one orElse two orElse three orElse wildcard

    println(partial(5))
    println(partial(4))
    println(partial(3))
    println(partial(2))
    println(partial(1))
    println(partial(0))
  }
}