package de.epost.sbt

object HelloWorldApp extends App {
  override def main(args: Array[String]): Unit = println(hello)

  def hello = "hello world. ;)"
}
