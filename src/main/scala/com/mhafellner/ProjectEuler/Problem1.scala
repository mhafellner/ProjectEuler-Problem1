package com.mhafellner.ProjectEuler

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Markus on 27/03/2016.
  */
object Problem1 {
  def main(args: Array[String]): Unit = {
    val allMod3 = findAllMod3(1000)
    val allMod5 = findAllMod5(1000)
    val sum = sumArrays(allMod3, allMod5)
    println(sum)
  }

  def findAllMod3(limit: Int): Array[Int] = {
    val allMultiples = new ArrayBuffer[Int]()
    for (i <- 1 until limit) {
      if (i % 3 == 0) {
        allMultiples += i
      }
    }
    allMultiples.toArray
  }

  def findAllMod5(limit: Int): Array[Int] = {
    val allMultiples = new ArrayBuffer[Int]()
    for (i <- 1 until limit) {
      if (i % 5 == 0) {
        allMultiples += i
      }
    }
    allMultiples.toArray
  }

  def sumArrays(a: Array[Int], b: Array[Int]): Int = {
    var sum: Int = 0
    val array = a.union(b).distinct
    for (i <- array.indices) {
      sum += array(i)
    }
    sum
  }
}
