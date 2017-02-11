package scala.school.polymorphism

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object VarianceAndBounds {

  //Variance
  //+T T' is a subclass of T
  //-T T is a subclass of T'

  class Animal {
    val sound = "rustle"
    override def toString(): String = {
      this.getClass().getCanonicalName() + ":" + sound
    }
  }

  class Bird extends Animal {
    override val sound = "call"
  }

  class Chicken extends Bird {
    override val sound = "cluck"
  }

  //Bounds
  def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)

  def main(args: Array[String]): Unit = {

    var flock = List(new Bird, new Bird)
    println(flock)

    println(new Chicken :: flock)

    //List also defines ::[B >: T](x: B) which returns a List[B]. Notice the B >: T.
    println(new Animal :: flock)
  }
}