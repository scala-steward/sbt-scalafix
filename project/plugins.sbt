resolvers += Resolver.sonatypeRepo("releases")
addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.0")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
unmanagedSourceDirectories.in(Compile) ++= {
  val root = baseDirectory.in(ThisBuild).value.getParentFile / "src" / "main"
  List(
    root / "scala",
    root / "scala-sbt-1.0"
  )
}
libraryDependencies ++= Dependencies.all
