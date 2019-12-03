package day01

import better.files._

object Fuel extends App {
  def requirement(mass: Int): Int = {
    mass / 3 - 2
  }

  def totalRequirement(mass: Int): Int = {
    LazyList.iterate(mass)(requirement)
      .tail
      .takeWhile(_ >= 0)
      .sum
  }

  val inputFile = file"src/main/resources/day01/input.txt"
  val masses: Vector[Int] = inputFile.lines.map(_.toInt).toVector

  val problem1 = masses.map(requirement).sum
  println(s"Problem1: $problem1")

  val problem2 = masses.map(totalRequirement).sum
  println(s"Problem2: $problem2")
}
