package org.bfil.euler

object Problem10 extends Problem {

  val name = "Summation of primes"
  val description =
    """
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    
    Find the sum of all the primes below two million.
    """
  val solution = 142913828922L

  // Parameters
  val max = 2000000

  def solve =
    primes.takeWhile(_ < max).foldLeft(0L)(_ + _)
}