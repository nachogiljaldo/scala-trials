package com.gilsoft.app.utils

object EvenNumberPrinter {
  def printFirst(count: Integer) : Unit = {
    Range.inclusive(0, count - 1).foreach(i => {
      if (i % 2 == 0) {
        println(i + " is even")
      }
    })
  }
}
