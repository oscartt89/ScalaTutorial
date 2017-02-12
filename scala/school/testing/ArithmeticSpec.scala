package scala.school.testing

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

import org.specs2._

class ArithmeticSpec extends Specification { def is = s2"""
  This is a specification to check the '+' operator
  The operator should
    return 2 while adding two times 1           $e1
    return 3 while adding three times 1         $e2
                                                      """
  def e1 = 1 + 1 mustEqual 2
  def e2 =  1 + 1 + 1 mustEqual 3
}