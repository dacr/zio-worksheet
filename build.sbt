organization := "fr.janalyse"
name         := "zio-worksheet"
homepage     := Some(new URL("https://github.com/dacr/zio-worksheet"))

licenses += "Apache 2" -> url(s"https://www.apache.org/licenses/LICENSE-2.0.txt")

scmInfo := Some(
  ScmInfo(
    url(s"https://github.com/dacr/zio-worksheet.git"),
    s"git@github.com:dacr/zio-worksheet.git"
  )
)

scalaVersion := "3.2.1"

lazy val versions = new {
  val zio = "2.0.4"
}

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"            % versions.zio,
  "dev.zio" %% "zio-test"       % versions.zio % Test,
  "dev.zio" %% "zio-test-junit" % versions.zio % Test,
  "dev.zio" %% "zio-test-sbt"   % versions.zio % Test
)

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
