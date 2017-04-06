import sbt._

object Dependencies {
  val amm = "com.lihaoyi" % "ammonite" % "0.8.2" cross CrossVersion.full
  val jGit = "org.eclipse.jgit" % "org.eclipse.jgit" % "4.6.1.201703071140-r"
}
