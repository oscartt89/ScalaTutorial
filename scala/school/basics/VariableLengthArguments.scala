/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object VariableLengthArguments {
  def capitalizeAll(args: String*) {
    args.map { arg =>
      print(arg.capitalize)
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    capitalizeAll("oscar", "torreno", "tirado")
  }
}