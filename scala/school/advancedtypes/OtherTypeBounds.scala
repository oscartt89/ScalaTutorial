package scala.school.advancedtypes

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object OtherTypeBounds {
  implicit def strToInt(s: String) = s.toInt

  class Container[A <% Int] (value: A) {
    //Must be equal
    def addIt(implicit evidence: A =:= Int) = 123 + value
    //Must be viewable as
    //def addIt(implicit evidence: A <%< Int) = 123 + value
  }

  def main(args: Array[String]) {
    println("123")

    println(new Container(123).addIt)
    //This one fails because String is not =:= Int
    //println(new Container("123").addIt)
  }
}