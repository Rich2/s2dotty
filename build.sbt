lazy val s2 = project.settings(
  scalaVersion := "2.13.2",
  scalaSource in Compile := (ThisBuild/baseDirectory).value / "src",
) 
lazy val dot = project.settings(
  scalaVersion := "0.24.0-RC1",
  resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
  scalacOptions ++= Seq("-feature", "-language:implicitConversions", "-noindent", "-deprecation", "-encoding", "UTF-8", "-unchecked"),
  scalaSource in Compile := (ThisBuild/baseDirectory).value / "src",
) 
