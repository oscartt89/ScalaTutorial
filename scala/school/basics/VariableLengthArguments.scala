package scala.school.basics

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object VariableLengthArguments {
  def capitalizeAll(args: String*) {
    args.map { arg =>
      arg.capitalize
    }
  }

  def main(args: Array[String]): Unit = {
    capitalizeAll("oscar", "torreno", "tirado")
  }
}