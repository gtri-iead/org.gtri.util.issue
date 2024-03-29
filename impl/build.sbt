scalaVersion := "2.10.0-RC5"

organization := "org.gtri.util"

name := "issue.impl"

version := "1.0-SNAPSHOT"

scalacOptions ++= Seq("-feature","-unchecked", "-deprecation")

resolvers += "iead-all" at "https://iead.ittl.gtri.org/artifactory/all" // need this for getting IEAD artifacts

libraryDependencies += "org.scalatest" % "scalatest_2.10.0-RC5" % "2.0.M5-B1"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.gtri.util" %% "scala.exelog" % "1.0-SNAPSHOT"

libraryDependencies += "org.gtri.util" % "issue.api" % "1.0-SNAPSHOT"


publishTo <<= {    // set publish repository url according to whether `version` ends in "-SNAPSHOT"
  val releases = "iead-artifactory" at "https://iead.ittl.gtri.org/artifactory/internal"
  val snapshots = "iead-artifactory-snapshots" at "https://iead.ittl.gtri.org/artifactory/internal-snapshots"
  version { v =>
    if (v.endsWith("-SNAPSHOT"))
      Some(snapshots)
    else Some(releases)
  }
}