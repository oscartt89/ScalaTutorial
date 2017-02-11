package scala.school.collections

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object FunctionalCombinators {
  def main(args: Array[String]): Unit ={
    //map
    //Evaluates a function over each element in the list, returning a list with the same number of elements.
    val numbers = List(1, 2, 3, 4)
    val numbersTwo = numbers.map((i: Int) => i * 2)
    numbersTwo.foreach(println)

    def timesTwo(i: Int): Int = i * 2
    val numbersTwo2 = numbers.map(timesTwo)
    numbersTwo2.foreach(println)

    //foreach
    //foreach is like map but returns nothing. foreach is intended for side-effects only.
    numbersTwo2.foreach(println)

    //filter
    //removes any elements where the function you pass in evaluates to false. Functions that return a Boolean
    //are often called predicate functions.
    val evenNumbers1 = numbers.filter((i: Int) => i % 2 == 0)
    evenNumbers1.foreach(println)

    def isEven(i: Int): Boolean = i % 2 == 0
    val evenNumbers2 = numbers.filter(isEven)
    evenNumbers2.foreach(println)

    //zip
    //zip aggregates the contents of two lists into a single list of pairs.
    List(1, 2, 3).zip(List("a", "b", "c")).foreach(println)

    //partition
    //partition splits a list based on where it falls with respect to a predicate function
    val oneToTen = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val res = oneToTen.partition(_ % 2 == 0)
    println("Fulfilling the partition condition")
    res._1.foreach(println)
    println("Not fulfilling the partition condition")
    res._2.foreach(println)

    //find
    //find returns the first element of a collection that matches a predicate function.
    val six = oneToTen.find(_ > 5)
    println(six.getOrElse(0))

    //drop & dropWhile
    //drop drops the first i elements
    oneToTen.drop(5).foreach(println)

    //dropWhile removes the first elements that match a predicate function.
    println("Removing the first odd elements: ")
    oneToTen.dropWhile(_ % 2 != 0).foreach(println)

    //foldLeft
    println(oneToTen.foldLeft(0)((m: Int, n: Int) => m + n))

    //seen visually
    oneToTen.foldLeft(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

    //Concatenate with fold
    println(oneToTen.foldLeft("") { (m: String, n: Int) => m + " " + n })

    //foldRight
    //Is the same as foldLeft except it runs in the opposite direction.
    oneToTen.foldRight(0) { (m: Int, n: Int) => println("m: " + m + " n: " + n); m + n }

    //flatten
    //flatten collapses one level of nested structure.
    val toFlat = List(List(1, 2), List(3, 4))
    toFlat.foreach(println)
    val flattened = toFlat.flatten
    flattened.foreach(println)

    //flatMap
    //flatMap is a frequently used combinator that combines mapping and flattening.
    //First the map is applied on the nested lists and then the result is flattened
    toFlat.flatMap(x => x.map(_ * 2)).foreach(println)

    //Generalized functional combinators
    //Now we've learned a grab-bag of functions for working with collections.
    // What we'd like is to be able to write our own functional combinators.
    // Interestingly, every functional combinator shown above can be written on top of fold. Let's see some examples.
    def ourMap(numbers: List[Int], fn: Int => Int): List[Int] = {
      numbers.foldRight(List[Int]()) { (x: Int, xs: List[Int]) =>
        fn(x) :: xs
      }
    }

    ourMap(numbers, timesTwo).foreach(println)

    //All the functional combinators also work on maps
    val extensions = Map("steve" -> 100, "bob" -> 101, "joe" -> 201)

    println(extensions.filter({case (name, extension) => extension < 200}))
  }
}