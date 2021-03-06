name := "unfiltered-scalate"

organization := "net.databinder"

crossScalaVersions := Seq(
  "2.9.1",
  "2.9.2"
)

version := "0.6.3"

seq(lsSettings :_*)

libraryDependencies <++= scalaVersion { v => Seq(
  "net.databinder" %% "unfiltered" % "0.6.3",
  "org.fusesource.scalate" % "scalate-core" % "1.5.3",
  "org.fusesource.scalate" % "scalate-util" % "1.5.3" % "test",
  "org.scala-lang" % "scala-compiler" % v % "test",
  "org.mockito" % "mockito-core" % "1.8.5" % "test",
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
) }
