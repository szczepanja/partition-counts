import PartitionCount._
import org.scalatest._
import flatspec._
import matchers._

class PartitionCountSpec extends AnyFlatSpec with should.Matchers {

  "partitionCount" should "return partition of number 5 as the sum of positive integers" in {
    partitionCount(5) should equal(7)
  }

  it should "return partition of number 4 as the sum of positive integers" in {
    partitionCount(4) should equal(5)
  }

  it should "return partition of number 666 as the sum of positive integers" in {
    partitionCount(66) should equal(2323520)
  }

}