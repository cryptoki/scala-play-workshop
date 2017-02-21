name := "U're first sbt project ;-)"
version := "1.0"
mainClass in (Compile, run) := Some("de.epost.sbt.Blafoo")
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
scalaVersion := "2.11.8"

// coverageMinimum := 80
// coverageFailOnMinimum := false