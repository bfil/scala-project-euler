package org.bfil.euler

abstract class Problem {
  val name:String
  val description:String
  val solution:AnyVal
  def solve():AnyVal
}