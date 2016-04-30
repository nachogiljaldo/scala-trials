package com.gilsoft.app.user

import java.time.LocalDate

import org.scalatest.{Matchers, FlatSpec}

import scala.collection.mutable.Stack

class UserSpec extends FlatSpec with Matchers {
  "A user" should "have firstName, lastName, birthDate" in {
    val user = new User("John", "Doe", LocalDate.of(1982, 8, 30))
    user.firstName should be ("John")
    user.lastName should be ("Doe")
    user.birthDate should be (LocalDate.of(1982, 8, 30))
  }

  "user.getAge()" should "return 0 if is less than 1 year" in {
    val user = new User("John", "Doe", LocalDate.now().minusYears(1).plusDays(1))
    user.getAge() should be (0)
  }

  "user.getAge()" should "return 1 if is 1 year exactly" in {
    val user = new User("John", "Doe", LocalDate.now().minusYears(1))
    user.getAge() should be (1)
  }

  "user.getAge()" should "return 1 if is more than 1 year" in {
    val user = new User("John", "Doe", LocalDate.now().minusYears(1).minusDays(1))
    user.getAge() should be (1)
  }
}
