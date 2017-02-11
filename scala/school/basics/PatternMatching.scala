package scala.school.basics

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object PatternMatching{
  def main(args: Array[String]): Unit ={
    val times = 1

    times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

    //Matching with guards
    times match {
      case i if i == 1 => "one"
      case i if i == 2 => "two"
      case _ => "some other number"
    }

    //Matching on type
    def bigger(o: Any): Any = {
      o match {
        case i: Int if i < 0 => i - 1
        case i: Int => i + 1
        case d: Double if d < 0.0 => d - 0.1
        case d: Double => d + 0.1
        case text: String => text + "s"
      }
    }

    class Calculator {
      val brand: String = "HP"
      val model: String = "20b"

      // An instance method.
      def add(m: Int, n: Int): Int = m + n
    }

    //Matching on class members
    def calcType(calc: Calculator) = calc match {
      case _ if calc.brand == "HP" && calc.model == "20b" => "financial"
      case _ if calc.brand == "HP" && calc.model == "48g" => "scientific"
      case _ if calc.brand == "HP" && calc.model == "30b" => "business"
      case _ => "unknown"
    }

  }
}