import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class KotestSimpleTest : StringSpec ({
    "simple" {true shouldBe false}
})
