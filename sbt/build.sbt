name := "U're first sbt project ;-)"
version := "1.0"
mainClass in (Compile, run) := Some("de.epost.sbt.Blafoo")
libraryDependencies += "org.specs2" % "specs2_2.12" % "2.4.17" % "test"
scalaVersion := "2.12.1"