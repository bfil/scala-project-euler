package org.bfil.euler

import org.bfil.euler._

object Problem4 extends Problem {

  val name = "Largest palindrome product"
  val description =
    """
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
  	
  	Find the largest palindrome made from the product of two 3-digit numbers.
    """
  val solution = 906609

  // Parameters
  val min = 100
  val max = 999

  def solve() =
    (for {
      i <- min to max
      j <- i to max if isPalindrome( (i * j).toString )
    } yield i * j).max
}