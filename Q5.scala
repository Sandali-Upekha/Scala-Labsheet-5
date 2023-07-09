import scala.io.StdIn.readInt

object Q5 {
  def sum(n: Int): Int = {
    if (n == 1) {
      1
    }
    else {
      n + sum(n - 2)
    }
  }

  def check(n: Int): Unit = {
    if (n % 2 != 0) {
      var result = sum(n)
      print (result)
    }
    else {
      var result1 = sum(n-1)
      print(result1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    check(num)
  }

}
