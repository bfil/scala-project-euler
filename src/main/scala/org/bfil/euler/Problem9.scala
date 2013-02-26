package org.bfil.euler

import scala.math._

object Problem9 extends Problem {

  val name = "Special Pythagorean triplet"
  val description =
    """
    A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
    
    a^2 + b^2 = c^2
    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
    """
  val solution = 31875000

  // Parameters
  val sum = 1000

  def solve =
    (for {
      a <- 1 to sum / 2
      b <- a to sum / 2
      c = sqrt(pow(a, 2) + pow(b, 2))
      if (a + b + c) == sum
    } yield (a, b, c)).map(n => n._1 * n._2 * n._3).head
}