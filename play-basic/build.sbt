name := "Play Basic Playground"
version := "1.0"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.2",
  ws
).map(_ % "test")
scalaVersion := "2.11.8"

// configuration of the main project
lazy val root = (project in file(".")).enablePlugins(PlayScala)