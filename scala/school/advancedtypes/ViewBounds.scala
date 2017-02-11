package scala.school.advancedtypes

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object ViewBounds {
  implicit def strToInt(s: String) = s.toInt

  class Container[A <% Int] {
    def addIt(x: A) = 123 + x
  }

  def main(args: Array[String]) {
    println("123")

    val y: Int = 123
    println(y)

    //This line requires the implicit declaration of the strToInt method
    println(math.max("123", 111))

    println(new Container[String].addIt("123"))
    println(new Container[Int].addIt(123))
    //This one fails because is not able to find the implicit value of a float
    //println(new Container[Float].addIt(123.2F))
  }
}