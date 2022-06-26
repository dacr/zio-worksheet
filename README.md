# ZIO worksheet [![][ZIOWorksheetManagerImg]][ZIOWorksheetManagerLnk]

A small library to simplify ZIO developer experience in the context of REPL sessions, scripts or worksheets. It must
only be used in this context, for example in real world projects you must use `ZIOAppDefault` or `ZIOSpecDefault`
as your main starting point for your ZIO projects.

This library comes with various helpers in order to make your code examples the most simple possible for learning, demo,
proof of concepts purposes. It brings a `.unsafeRun` function (originally written by @adamgfraser) to quickly start
an effect synchronously and get its results :

```scala
//> using scala  "3.1.3"
//> using lib "dev.zio::zio-worksheet:2.0.0.0"

import zio.*
import zio.worksheet.*

val app = Console.printLine("Hello world !")
app.unsafeRun
```

[ZIOWorksheetManagerImg]: https://img.shields.io/maven-central/v/fr.janalyse/zio-worksheet_3.svg
[ZIOWorksheetManagerLnk]: https://search.maven.org/#search%7Cga%7C1%7Cfr.janalyse.zio-worksheet
