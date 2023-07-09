import scala.io.StdIn.readInt
object Q1 {
  def prime(n: Int, i: Int): Boolean =  {
    //var result = true
    if (i < 3){
      true
    }
    else if (n % i == 0){
      false
    }
    else {
      prime(n,i-1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter number: ")
    val num = readInt()
    val result = prime(num,num-1)
    println(result)
  }
}
