package org.bfil.euler

trait ProblemUtilities {
  
  val fibs: Stream[Int] =
    0 #:: 1 #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
}