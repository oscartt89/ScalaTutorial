package scala.school.basics;

/**
  * Created by oscartorrenotirado on 11/2/17.
  * https://twitter.github.io/scala_school/basics.html
  */

object PartialApplication{
  def adder(m: Int, n: Int) = m + n

  def main(args: Array[String]): Unit ={
    val add2 = adder(2, _:Int)

    println("Adding 5 to 2 with adder(): " + adder(2, 5))
    println("Adding 5 to 2 with add2(): " + add2(5))
  }
}
