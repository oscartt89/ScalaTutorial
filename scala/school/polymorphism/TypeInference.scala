package scala.school.polymorphism

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object TypeInference {
  def id[T](x: T) = x

  def main(args: Array[String]): Unit = {
    val x = id(322)
    println(x)

    val y = id("hey")
    println(y)

    val z = id(Array(1, 2, 3, 4))
    z.foreach(println)
  }
}