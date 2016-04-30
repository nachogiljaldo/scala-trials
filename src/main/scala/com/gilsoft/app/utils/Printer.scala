package com.gilsoft.app.utils

object Printer {
  def printIfCondition(count: Int, condition: Int => Boolean): Unit = {
    Range.inclusive(0, count - 1).foreach(i => {
      if (condition(i)) {
        println(i + " matches the condition")
      }
    })
  }
}
