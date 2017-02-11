package scala.javaprogrammers

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
  * Created by oscartorrenotirado on 11/2/17.
  */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new java.util.Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println (df format now)
  }
}
