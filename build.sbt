lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "RxScala.js"

normalizedName := "rxscala-js"

version := "0.15.4"

organization := "com.github.lukajcb"

scalaVersion := "2.13.10"


libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.1.0",
  "org.typelevel" %%% "cats-core" % "2.7.0"
//  "com.lihaoyi" %%% "utest" % "0.4.5" % Test,
//  "org.typelevel" %%% "cats-testkit" % "1.0.0-RC1" % Test
)


//jsDependencies += "org.webjars.npm" % "rxjs" % "5.4.3" % Test / "bundles/Rx.min.js" commonJSName "Rx"


publishMavenStyle := true

pomIncludeRepository := { _ => false }
