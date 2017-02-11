/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object CaseClasses {
  case class Calculator(brand: String, model: String)

  def calcType(calc: Calculator) = calc match {
    case Calculator("HP", "20b") => "financial"
    case Calculator("HP", "48g") => "scientific"
    case Calculator("HP", "30b") => "business"
    case Calculator(ourBrand, ourModel) => "Calculator %s %s is of unknown type".format(ourBrand, ourModel)
  }

  def main(args: Array[String]): Unit = {
    val hp20b = Calculator("HP", "20b")
    val hp20B = Calculator("HP", "20b")
    val hp30b = Calculator("HP", "30b")
    val hp50b = Calculator("HP", "50b")

    println(hp20b == hp20B)

    println(calcType(hp20b))
    println(calcType(hp30b))
    println(calcType(hp50b))

  }
}