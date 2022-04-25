import scala.annotation.tailrec

object PartitionCount {

  def partitionCount(n: Int): Int = {

    @tailrec
    def countUp(amount: Int, seq: List[Int]): List[Int] = (amount, seq) match {
      case (amount, seq) if (amount < seq.head) => seq.head + amount :: seq.tail
      case _ => countUp(amount - seq.head, seq.head :: seq)
    }

    def addNext(partition: Option[List[Int]]): Option[List[Int]] = {
      partition.get match {
        case List(n) => None
        case p => Some(countUp(p.head - 1, p.tail.head + 1 :: p.tail.tail))
      }
    }

    Iterator.iterate(Some(List.fill(n)(1)): Option[List[Int]])(addNext)
      .takeWhile(_.isDefined)
      .map(_.get).size
  }
}
