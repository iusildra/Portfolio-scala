enablePlugins(ScalaJSPlugin)

name := "Portfolio with scala.js"
scalaVersion := "3.2.0"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true