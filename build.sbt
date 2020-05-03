name := "scala-coreutils"

version := "0.1"

scalaVersion := "2.13.2"

enablePlugins(PackPlugin)
packMain := Map(
    "hello" -> "sample.Hello",
    "hi" -> "sample.Hi"
)
