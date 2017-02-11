package scala.javaprogrammers

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

class Reference[T] {
  private var contents: T = _
  def set(value: T) { contents = value }
  def get: T = contents
}
