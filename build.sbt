name := "quark"

version := "0.1"

scalaVersion := "2.12.1"

scalacOptions := Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Ywarn-unused-import"
)

libraryDependencies ++= {
  val akkaStreamV = "2.5.6"
  val akkaHttpV = "10.0.10"
  val scalaTestV = "3.0.1"
  val shapelessV = "2.3.2"
  val pureConfigV = "0.8.0"
  Seq(
    "org.scalatest" %% "scalatest" % scalaTestV % "test",
    "com.typesafe.akka" %% "akka-http" % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpV % Test,
    "com.typesafe.akka" %% "akka-stream" % akkaStreamV,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaStreamV % Test,
    "com.chuusai" %% "shapeless" % shapelessV,
    "com.github.pureconfig" %% "pureconfig" % pureConfigV
  )
}

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)