package de.epost.sbt

import org.scalatest.FunSuite

class AnotherMessageSpec extends FunSuite {
  
  test("should deliver hello world. ;)") {
    assert(HelloWorldApp.hello === "hello world. ;)")
  }
}
