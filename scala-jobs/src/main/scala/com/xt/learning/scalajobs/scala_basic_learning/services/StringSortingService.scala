package com.xt.learning.scalajobs.scala_basic_learning.services

class StringSortingService {
    def stringSorting(inp_str: String): String = {
      val str_lower = inp_str.toLowerCase
      val str_split = str_lower.split(" ")
      val str_sort = str_split.sorted.mkString(", ")

      str_sort

  }
}
