package org.bfil.euler

object Runner {
  def run(problems: Problem*) = for (problem <- problems) {
    resultOf(problem) match {
      case (true, elapsedTime) => println(problem.name + ": solved in " + elapsedTime + "ms!")
      case _ => println(problem.name + ": not solved!")
    }
  }

  def resultOf(problem: Problem): (Boolean, Any) = {
    val start = System.nanoTime
    problem.solve match {
      case result if result == problem.solution => (true, (System.nanoTime - start) / 1000000)
      case _ => (false, None)
    }
  }
}