package com.xt.learning.scalajobs.scala_basic_learning.services

class PrimeNumberService {

  def primeNum(num: Int) = {
    var myArray: Array[Int] = Array()

    for (i <- 1 to num) {
      var k = 0
      for (j <- 2 to i) {
        if (i % j == 0) {
          k = 1
        }

        if (k == 0) {
          if (!myArray.contains(i)) {
            myArray = myArray :+ i
          }
        }
      }
    }
    print("1, 2, ")
    //println(myArray.mkString(", "))
    myArray
  }

}
