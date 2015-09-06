name := """perolas"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .enablePlugins(JavaAppPackaging)

scalaVersion := "2.11.1"


libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)


libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
