package de.epost.sbt

import org.scalatest.FlatSpec


class MessageSpec extends FlatSpec {

  "hello" should "hello world. ;)" in {
    val message = HelloWorldApp.hello
    assert(message == "hello world. ;)")
  }

}
