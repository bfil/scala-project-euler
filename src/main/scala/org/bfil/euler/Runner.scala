package org.bfil.euler

object Runner {
  def run(problems: Problem*) = for (problem <- problems) {
    val problemId = problem.getClass.getSimpleName
    resultOf(problem) match {
      case (true, elapsedTime) => println(problemId + " " + problem.name + ": solved in " + elapsedTime + "ms!")
      case _ => println(problemId + " " + problem.name + ": not solved!")
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