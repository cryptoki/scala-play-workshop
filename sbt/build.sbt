name := "U're first sbt project ;-)"
version := "1.0"
mainClass in (Compile, run) := Some("de.epost.sbt.Blafoo")
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2",
  "org.mockito" % "mockito-core" % "1.10.8"
).map(_ % "test")
scalaVersion := "2.11.8"

// coverageMinimum := 80
// coverageFailOnMinimum := false
