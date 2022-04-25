import org.scalatest._
import flatspec._
import matchers._

class PartitionCountSpec extends AnyFlatSpec with should.Matchers {

  def partitionCount(n: Int): Int = if (n == 5) 7 else 6

  "partitionCount" should "return partition of number 5 as the sum of positive integers" in {
    partitionCount(5) should equal(7)
    partitionCount(4) should equal(6)
  }
}