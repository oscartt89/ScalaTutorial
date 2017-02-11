package scala.school.basics

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object BasicDataStructures {
  def main(args: Array[String]): Unit = {
    //Arrays
    //Arrays preserve order, can contain duplicates, and are mutable.
    val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    println(numbers(3))

    //Lists
    //Lists preserve order, can contain duplicates, and are immutable.
    val numbersList = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)

    // This will raise an error, not possible to change list values
    // numbersList(3) = 10

    //Sets
    //Sets do not preserve order and have no duplicates
    val numbersSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    println("numbersSet: ")
    numbersSet.foreach(println)

    //Tuples
    //A tuple groups together simple logical collections of items without using a class.
    val hostPort = ("localhost", 80)

    println("Tuples:")
    //Accessing members of a tuple
    println(hostPort._1)
    println(hostPort._2)

    //Tuples fit with pattern matching nicely
    hostPort match {
      case ("localhost", port) => println("(localhost, %d)".format(port))
      case (host, port) => println("(%s, %d)".format(host, port))
    }

    //Tuples can also be created using '->'
    println(1 -> 2) //(1,2)

    //Maps
    //It can hold basic datatypes.
    val map1 = Map(1 -> 2)
    val map2 = Map("foo" -> "bar")

    println(map1)
    println(map2)

    //Maps can themselves contain Maps or even functions as values.
    Map(1 -> Map("foo" -> "bar"))

    Map("timesTwo" -> { 2.*(_:Int):Int})

    //Option
    //Option is a container that may or may not hold something.
    val numbersMap = Map("one" -> 1, "two" -> 2)

    println(numbersMap.get("two"))
    println(numbersMap.get("three"))

    //How do we work with the map get result
    //1. getOrElse function
    val res1 = numbersMap.get("three")
    val result = res1.getOrElse(0) * 2
    println(result)
    //2. Pattern matching
    val result2 = res1 match {
      case Some(n) => n * 2
      case None => 0
    }
    println(result2)
  }
}