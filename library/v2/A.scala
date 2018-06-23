package com.example

object A {
  def foo[A](f: Int => Option[A]): Unit = {
    f(42).isEmpty
  }
}
