package scala.school.polymorphism

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object ParametricPolymorphism {
  def drop1[A](l: List[A]) = l.tail

  def main(args: Array[String]): Unit = {
    //This does not allow to recover any type information about individual members
    println(2 :: 1 :: "bar" :: "foo" :: Nil)

    println(drop1(List(1, 2, 3)))
  }
}