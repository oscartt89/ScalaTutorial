package scala.school.testing

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

import org.specs2._
import org.specs2.matcher.Matcher
import org.specs2.matcher.Expectable

class MatchersSpec extends Specification {
  def is =
    s2"""
  This is a specification to list the check operations of collections
  The list (1, 2, 3) must
    contain 1                   $e1
    not contain 4               $e2
    contain all (1, 2, 3)       $e3
    equal (1, 2, 3)             $e4
  The map ('one' -> 1, 'two' -> 2, 'three' -> 3) must
    haveKey one                 $e5
    not haveKey four            $e6
    haveValue 1                 $e7
    not haveValue 4             $e8
  Numbers
    3 must be less than 5       $e9
    5 must be less than or equal to 5   $e10
    5 must be greater than 3    $e11
    5 must be greater than or equal to 5  $e12
    5 must be close to 6, delta 1 $e13
  Testing myOwn matcher         $e14
                                """

  val numbers = List(1, 2, 3)

  def e1 = numbers must contain(1)

  def e2 = numbers must not contain (4)

  def e3 = numbers must containAllOf(List(1, 2, 3))

  def e4 = numbers mustEqual (List(1, 2, 3))


  val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

  def e5 = map must haveKey("one")

  def e6 = map must not haveKey ("four")

  def e7 = map must haveValue(1)

  def e8 = map must not haveValue (4)

  def e9 = 3 must beLessThan(5)

  def e10 = 5 must beLessThanOrEqualTo(5)

  def e11 = 5 must beGreaterThan(3)

  def e12 = 5 must beGreaterThanOrEqualTo(5)

  def e13 = 5 must beCloseTo(6, 1)

  /** Options
    * a must beNone
    * a must beSome[Type]
    * a must beSomething
    * a must beSome(value)
    */

  /** throwA
    * a must throwA[WhateverException]
    *
    * you can also match on the exception
    * a must throwA(new Exception) like {
    * case Exception(m) => m.startsWith("bad")
    * }
    */

  def beEven: Matcher[Int] = { n: Int =>
    (n % 2 == 0, n + " is not even")
  }

  def e14 = 2 must beEven

}
