import scala.io.StdIn.readInt
object Q2 {
  def prime(n: Int, i: Int): Boolean = {
    if (i < 3) {
      true
    }
    else if (n % i == 0) {
      false
    }
    else {
      prime(n, i - 1)
    }
  }
  def primeseq(n: Int) : Unit = {
    var result = prime (n,n-1)
    if (result==true){
      print (n + " ")
    }
    if (n>2){
    primeseq(n-1)}
  }
  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    primeseq(num)
  }
}