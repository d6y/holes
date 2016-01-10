organization := "underscore.io"

name := "holes"

version := "1.0.0"

val commonSettings = Seq(
  scalaVersion := "2.11.7",
  scalacOptions ++= Seq("-deprecation", "-feature"),
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value
  )
)

lazy val macro        = project.in(file("macro")).settings(commonSettings : _*)

lazy val app           = project.in(file("app")).settings(commonSettings : _*).dependsOn(macro)
