# ZIO worksheet [![][ZIOWorksheetManagerImg]][ZIOWorksheetManagerLnk] ![Scala CI][scalaci-master]

A small library to simplify ZIO developer experience in the context of REPL sessions, scripts or worksheets. It must
only be used in this context, for example in real world project you should use `ZIOAppDefault` or `ZIOSpecDefault`
as your main starting points for your ZIO project.

This library brings various helpers in order to make your code examples the most simple possible for learning, demo,
proof of concepts purposes. It brings a `.unsafeRun` function (originally written by @adamgfraser) to quickly start
an effect synchronously and get its results :

```scala
//> using scala  "3.1.3"
//> using lib "dev.zio::zio-worksheet:2.0.0.0"

import zio.*

val app = Console.printLine("Hello world !")
app.unsafeRun
```

[ZIOWorksheetManagerImg]: https://img.shields.io/maven-central/v/fr.janalyse/zio-worksheet_3.svg
[ZIOWorksheetManagerLnk]: https://search.maven.org/#search%7Cga%7C1%7Cfr.janalyse.zio-worksheet
