import sbt._

object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.6" % "test"

  val libraryDependency = Seq(scalatest)
}
