
credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  sys.env.getOrElse("SONATYPE_USERNAME", ""),
  sys.env.getOrElse("SONATYPE_PASSWORD", "")
)

developers := List(
  Developer("lucidsoftware", "Lucid Software", "github@lucidchart.com", url("https://www.golucid.co/"))
)

description := "A better solution for cross compiling Scala versions in SBT."

homepage := Some(url("https://github.com/lucidsoftware/sbt-cross"))

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.5"
)

licenses += "Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")

name := "sbt-cross"

organization := "com.lucidchart"

organizationHomepage := Some(url("https://www.golucido.co/"))

organizationName := "Lucid Software"

PgpKeys.pgpPassphrase in Global := Some(Array.emptyCharArray)

sbtPlugin := true

scalacOptions ++= Seq("-deprecation")

scmInfo := Some(ScmInfo(url("https://github.com/lucidsoftware/sbt-cross"), "scm:git:git@github.com:lucidsoftware/sbt-cross", None))

startYear := Some(2017)

version := sys.props.getOrElse("build.version", "0-SNAPSHOT")

crossSbtVersions := Seq("0.13.16", "1.0.3")
