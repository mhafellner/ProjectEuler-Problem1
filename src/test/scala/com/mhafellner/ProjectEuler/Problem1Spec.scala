package com.mhafellner.ProjectEuler

import org.scalatest._

/**
  * Created by Markus on 27/03/2016.
  */
class Problem1Spec extends FlatSpec with Matchers {
  behavior of "Problem1"

  "findAllMod3" should "return an Array[Int]" in {
    Problem1.findAllMod3(0) should be(Array[Int]())
  }

  "findAllMod3 with limit 10" should "return [3,6,9]" in {
    Problem1.findAllMod3(10) should be(Array[Int](3, 6, 9))
  }

  "findAllMod5" should "return an Array[Int]" in {
    Problem1.findAllMod5(0) should be(Array[Int]())
  }

  "findAllMod5 with limit 20" should "return [5,10,15]" in {
    Problem1.findAllMod5(20) should be(Array[Int](5, 10, 15))
  }

  "sumArrays" should "return Int" in {
    Problem1.sumArrays(Array[Int](3, 6), Array[Int](5)) should be(14)
  }

  "sumArrays" should "count duplicate values just once" in {
    Problem1.sumArrays(Array[Int](3, 6, 9, 12, 15, 18), Array[Int](5, 10, 15)) should be(78)
  }
}
