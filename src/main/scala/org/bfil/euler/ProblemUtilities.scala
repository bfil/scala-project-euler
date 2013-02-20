package org.bfil.euler

trait ProblemUtilities {

  val fibs: Stream[Int] =
    0 #:: 1 #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }

  def primes: Stream[Int] = {
    lazy val ps = 2 #:: sieve(3)
    def sieve(p: Int): Stream[Int] = {
      p #:: sieve(
        Stream.from(p + 2, 2).
          find(i => ps.takeWhile(j => j * j <= i).
            forall(i % _ > 0)).get)
    }
    ps
  }
  
  def isPalindrome(s: String): Boolean = s == s.reverse
}