name := "play-prototype"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.29",
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
