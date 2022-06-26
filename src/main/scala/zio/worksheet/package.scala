package zio

package object worksheet {
  /* Originally written by @adamgfraser after some discussions on zio discord
   */
  implicit class RunSyntax[A](io: ZIO[Any, Any, A]) {
    def unsafeRun: A =
      Unsafe.unsafeCompat { implicit u =>
        Runtime.default.unsafe.run(io).getOrThrowFiberFailure()
      }
  }
}
