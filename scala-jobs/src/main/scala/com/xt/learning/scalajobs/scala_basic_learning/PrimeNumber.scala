package com.xt.learning.scalajobs.scala_basic_learning

import com.xt.learning.scalajobs.scala_basic_learning.services.PrimeNumberService
object PrimeNumber {
  def main(args: Array[String]): Unit = {
    val pNum = new PrimeNumberService()
    try {
      print("\n Enter number till which you want to print prime number : ")
      val num = scala.io.StdIn.readInt()
      print(pNum.primeNum(num).mkString(", "))
    }
    catch {
      case e: Exception =>
        // Handle any exception and print details
        println(" Error: Generic Exception caught")
        println(" Exception Message: " + e.getMessage)

    } finally {
      // Code that will be executed regardless of whether an exception is thrown or not
      println("\n Finally block executed..!\n")
    }
  }
}
