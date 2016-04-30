package com.gilsoft.app.user

import java.time.LocalDate
import java.time.LocalDate.now

class User(fName: String, lName: String, bDate: LocalDate) {
  def firstName = this.fName
  def lastName = this.lName
  def birthDate = this.bDate

  def getAge() = {
    val offset = if (now().isBefore(birthDate.withYear(now().getYear()))) {
      -1
    } else {
      0
    }
    now().getYear() - birthDate.getYear() + offset;
  }
}
