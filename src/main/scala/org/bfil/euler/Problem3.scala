package org.bfil.euler

import org.bfil.euler._
import scala.math.sqrt

object Problem3 extends Problem {
  
  val name = "Largest prime factor"
  val description =
    """
    The prime factors of 13195 are 5, 7, 13 and 29.
  	
  	What is the largest prime factor of the number 600851475143 ?
    """
  val solution = 6857
  
  // Parameters
  val n = 600851475143L
  
  def solve() =
    primes takeWhile(_ <= sqrt(n) ) filter(n % _ == 0) last
}