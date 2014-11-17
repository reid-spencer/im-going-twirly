scalaVersion := "2.10.4"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xlint")

// To get more information during initialization
logLevel := Level.Debug

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.0.3")

