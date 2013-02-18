package org.sample

case class Person(val first: String, val last: String, val age: Int) {
  def valid: Boolean = age > 18
}

object ScalaVJava extends App {
  def validByAge(in: List[Person]) = in.filter(p => p.valid).sortBy(p => p.age).map(p => p.first)
  println(validByAge(List(Person("John.POE", "PlentyOldEnough", 32), Person("John.TY", "TooYoung", 17), Person("John.OE", "OldEnough", 19))))
}
