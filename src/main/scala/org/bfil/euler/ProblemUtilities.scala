package org.bfil.euler

trait ProblemUtilities {
  
  val fibs: Stream[Int] =
    0 #:: 1 #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
  
  def sieve(s: Stream[Int]): Stream[Int] = {
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))
  }
  
  val sieve: Stream[Int] = 1 #:: sieve( Stream.from(2) )
}