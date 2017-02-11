import scala.school.basics.PartialApplication

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object CurriedFunction{
  def multiply(m: Int)(n: Int): Int = m * n
  val timesTwo = multiply(2) _
  val curriedAdd = (PartialApplication.adder _).curried
  val addTwo = curriedAdd(2)

  def main(args: Array[String]): Unit ={
    println(multiply(2)(3))
    println(timesTwo(3))
    println(addTwo(4))
  }
}