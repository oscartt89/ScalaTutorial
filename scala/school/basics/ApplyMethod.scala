package scala.school.basics

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object ApplyMethod {
  class Foo {}

  object FooMaker {
    def apply() = new Foo
  }

  def main(args: Array[String]): Unit = {
    val newFoo = FooMaker()
    println(newFoo)
  }
}