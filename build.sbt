name := "ClimateETLPipeline"

version := "0.1"

scalaVersion := "2.12.18" // Spark works best with Scala 2.12

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1",
  "org.apache.spark" %% "spark-sql" % "3.5.1",
  "com.typesafe" % "config" % "1.4.3",
  "org.postgresql" % "postgresql" % "42.7.3"
)

