import scala.io.StdIn.readInt
object Q3 {
  def sum(n: Int): Int = {
    if (n==1){
      1
    }
    else {
      n + sum(n-1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    val add = sum(num)
    print (add)
  }
}