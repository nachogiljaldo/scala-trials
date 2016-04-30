package com.gilsoft.app

import java.time.LocalDate

import com.gilsoft.app.user.User
import com.gilsoft.app.utils.{Printer, EvenNumberPrinter}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val user = new User("John", "Doe", LocalDate.of(1982, 8, 30))
    println(user)
    println(user.firstName)
    println(user.lastName)
    println(user.birthDate)
    println(user.getAge())
    EvenNumberPrinter.printFirst(10)
    Printer.printIfCondition(10, _ % 3 == 0)
    Printer.printIfCondition(10, (i) => i % 4 == 0)
  }
}
