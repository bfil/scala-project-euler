package org.bfil.euler

object Problem16 extends Problem {

  val name = "Power digit sum"
  val description =
    """
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 2^1000?
    """
  val solution = 1366

  // Parameters
  val n = 2
  val power = 1000

  def solve =
    BigInt(n).pow(power).toString.map(_.asDigit).reduceLeft(_ + _)
}