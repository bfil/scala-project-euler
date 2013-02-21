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

  def factors(n: Long): List[Long] = {
    def ldf(k: Long, n: Long): Long = {
      if (n % k == 0) k
      else if ((k * k) > n) n
      else ldf((k + 1), n)
    }
    n match {
      case 1 => Nil;
      case _ => {
        val p = ldf(2, n)
        p :: factors(n / p)
      }
    }
  }
}