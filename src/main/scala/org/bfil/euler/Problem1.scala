package org.bfil.euler

object Problem1 extends Problem {

  val name = "Multiples of 3 and 5"
  val description =
    """
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    
    Find the sum of all the multiples of 3 or 5 below 1000.
    """
  val solution = 233168

  // Parameters
  val max = 1000

  def solve() =
    1 until max filter (i => i % 3 == 0 || i % 5 == 0) reduceLeft (_ + _)
}