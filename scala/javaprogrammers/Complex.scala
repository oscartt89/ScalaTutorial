package scala.javaprogrammers

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

class Complex(real: Double, imaginary: Double){
  def re = real
  def im = imaginary
  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}