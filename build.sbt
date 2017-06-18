lazy val akkaHttpVersion = "10.0.6"
lazy val akkaVersion    = "2.5.1"
lazy val circeVersion = "0.8.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.example",
      scalaVersion    := "2.12.2"
    )),
    name := "shift",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"         % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"       % akkaVersion,
      "io.circe"          %% "circe-core"        % circeVersion,
      "io.circe"          %% "circe-generic"     % circeVersion,
      "io.circe"          %% "circe-parser"      % circeVersion,
      "de.heikoseeberger" %% "akka-http-circe"   % "1.16.0",
      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "org.scalatest"     %% "scalatest"         % "3.0.1"         % Test
    )
  )

