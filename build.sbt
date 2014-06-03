organization := "com.github.inakata"

name := "ruby_scala"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation","-unchecked", "-Yrangepos")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"
)

initialCommands in console += {
  Iterator("com.github.inakata.ruby_scala._").map("import "+).mkString("\n")
}
