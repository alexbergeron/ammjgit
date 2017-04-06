import Dependencies._


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.github.alexbergeron",
      scalaVersion := "2.11.8",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "amm-jgit",
    libraryDependencies ++= Seq(
      amm,
      jGit
    ),
    mainClass in assembly := Some("ammjgit.Main")
  )
