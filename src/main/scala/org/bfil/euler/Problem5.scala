package org.bfil.euler

import scala.math._

object Problem5 extends Problem {

  val name = "Smallest multiple"
  val description =
    """
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    """
  val solution = 232792560

  // Parameters
  val max = 20

  def solve() =
    (for {
      i <- 2 to max
      fs = factors(i)
      j <- fs.distinct.map(n => {
        (n, fs.count(_ == n))
      })
    } yield j).distinct.sorted.toMap.map(n => pow(n._1, n._2)).reduceLeft(_ * _)
}