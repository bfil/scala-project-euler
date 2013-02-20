import sbt._
import sbt.Keys._

object ProjectEulerBuild extends Build {

  lazy val projectEuler = Project(
    id = "project-euler",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Project Euler",
      organization := "org.bfil",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
