package org.bfil.euler

object Problem7 extends Problem {

  val name = "10001st prime"
  val description =
    """
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    
    What is the 10 001st prime number?
    """
  val solution = 104743

  // Parameters
  val pos = 10001

  def solve =
    primes.take(pos).last
}