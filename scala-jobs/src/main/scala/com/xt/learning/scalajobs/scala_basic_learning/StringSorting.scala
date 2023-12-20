package com.xt.learning.scalajobs.scala_basic_learning

import com.xt.learning.scalajobs.scala_basic_learning.services.StringSortingService

object StringSorting {
  def main(args: Array[String]): Unit = {

    try {
      val argMap = args.map(_.split("=")).map(a => (a(0), a(1))).toMap

      if (!argMap.keySet.contains("input_string")) {
        throw new Exception("Argument missing!")
      }

      val sss = new StringSortingService()

      val input_string = argMap.getOrElse("input_string", "")
      val out_string = sss.stringSorting(input_string)
      println("\n String before sorting : " + input_string)
      println("\n String after sorting : " + out_string)

    } catch {
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
