name := "Play Basic Playground"
version := "1.0"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2"
).map(_ % "test")
scalaVersion := "2.11.8"
