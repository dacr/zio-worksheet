name         := "zio-worksheet"
organization := "fr.janalyse"
description  := "To simplify ZIO usage within scripts or worksheets"

licenses += "Apache 2" -> url(s"https://www.apache.org/licenses/LICENSE-2.0.txt")

scalaVersion := "3.3.5"

lazy val versions = new {
  val zio = "2.1.17"
}

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"            % versions.zio,
  "dev.zio" %% "zio-test"       % versions.zio % Test,
  "dev.zio" %% "zio-test-junit" % versions.zio % Test,
  "dev.zio" %% "zio-test-sbt"   % versions.zio % Test
)

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")

homepage   := Some(url("https://github.com/dacr/zio-worksheet"))
scmInfo    := Some(ScmInfo(url(s"https://github.com/dacr/zio-worksheet.git"), "scm:git@github.com:dacr/zio-worksheet.git"))
developers := List(
  Developer(
    id = "dacr",
    name = "David Crosson",
    email = "crosson.david@gmail.com",
    url = url("https://github.com/dacr")
  )
)
