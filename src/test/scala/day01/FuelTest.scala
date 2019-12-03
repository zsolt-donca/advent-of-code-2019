package day01

import org.scalatest.funsuite.AnyFunSuite

class FuelTest extends AnyFunSuite {
  test("Problem 1 examples") {
    assert(Fuel.requirement(12) == 2)
    assert(Fuel.requirement(14) == 2)
    assert(Fuel.requirement(1969) == 654)
    assert(Fuel.requirement(100756) == 33583)
  }

  test("Problem 2 examples") {
    assert(Fuel.totalRequirement(14) == 2)

    assert(Fuel.requirement(1969) == 654)
    assert(Fuel.requirement(654) == 216)
    assert(Fuel.requirement(216) == 70)
    assert(Fuel.requirement(70) == 21)
    assert(Fuel.requirement(21) == 5)
    assert(Fuel.totalRequirement(1969) == 966)

    assert(Fuel.totalRequirement(100756) == 50346)
  }
}
