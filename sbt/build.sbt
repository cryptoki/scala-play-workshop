name := "U're first sbt project ;-)"
version := "1.0"
mainClass in (Compile, run) := Some("de.epost.sbt.Blafoo")
libraryDependencies += "org.specs2" % "specs2_2.11" % "3.3.1" % "test"
scalaVersion := "2.11.8"