package org.bfil.euler

object Problem15 extends Problem {

  val name = "Lattice paths"
  val description =
    """
    Starting in the top left corner of a 2x2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
    
    How many such routes are there through a 20x20 grid?
    """
  val solution = 137846528820L

  // Parameters
  val size = 20

  def solve = {

    val cache = collection.mutable.Map.empty[(Int, Int), Long]

    def countRoutes(x: Int, y: Int): Long = {
      if (x < size && y < size) {
        if (!cache.contains(x, y)) cache((x, y)) = countRoutes(x + 1, y) + countRoutes(x, y + 1)
        cache((x, y))
      } else 1
    }

    countRoutes(0, 0)
  }
}