package scala.javaprogrammers

import java.text.DateFormat.{LONG, getDateInstance}
import java.util.Locale

/**
  * Created by oscartorrenotirado on 11/2/17.
  */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println (df format now)
  }
}
