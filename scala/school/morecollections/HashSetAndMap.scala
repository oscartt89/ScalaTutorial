package scala.school.morecollections

import scala.collection.mutable

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object HashSetAndMap {
  def main(args: Array[String]): Unit = {
    val set = mutable.HashSet(1, 2, 3, 4)
    println(set)
    println(set.contains(4))

    val map = mutable.HashMap("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
    println(map)
    println(map.contains("three"))

    val treeMap = mutable.TreeMap("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4)
    println(treeMap)

    val vector = Vector(1, 2, 3, 4, 5, 6, 7, 8)
    println(vector :+ 9)
  }
}