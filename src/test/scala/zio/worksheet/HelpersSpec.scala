package zio.worksheet

import zio.*
import zio.test.*
import zio.test.TestAspect.*
import org.junit.runner.RunWith
import zio.worksheet.*

@RunWith(classOf[zio.test.junit.ZTestJUnitRunner])
class HelpersSpec extends ZIOSpecDefault {
  def spec = suite("Helpers")(
    test("unsafe synchronous start")(
      assertTrue(ZIO.succeed(42).unsafeRun == 42)
    )
  )
}
