/**
  * Created by oscartorrenotirado on 11/2/17.
  */

class Reference[T] {
  private var contents: T = _
  def set(value: T) { contents = value }
  def get: T = contents
}

object IntegerReference {
  def main(args: Array[String]) {
    var cell = new Reference[Int]
    cell.set(13)
    println("Reference contains the half of " + (cell.get * 2))
  }
}