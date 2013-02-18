import sbt._
import sbt.Keys._

object ScalavjavaBuild extends Build {

  lazy val scalavjava = Project(
    id = "scala-v-java",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "scala-v-java",
      organization := "org.sample",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0"
      // add other settings here
    )
  )
}
