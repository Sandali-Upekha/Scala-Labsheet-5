import scala.io.StdIn.readInt
object Q6 {
  def fib(n: Int): BigInt = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 2) + fib(n - 1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    (0 to num).foreach(num => print(fib(num) + " "))

  }

  /*
  (0 to 10).foreach(n => print(fib(n) + " "))
  // 0 1 1 2 3 5 8 13 21 34 55

  fib(50)
  // res1: BigInt = 12586269025*/

}
