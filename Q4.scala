import scala.io.StdIn.readInt

object Q4 {
  def check(n : Int ) : String = {
    var result = "Even"
    if (n % 2 != 0) {
     result = "Odd"
    }
    return (result)
  }


  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    val result = check(num)
    print(result)
  }
}
