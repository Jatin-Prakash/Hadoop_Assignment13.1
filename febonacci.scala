object febonacci {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    febonacciSeries(7)
  }
def febonacciSeries(x : Int)  = {


 var y :  Int = 1
var z : Int =2
print(y)
  print(z)
  for (i <- 1 to x){
  var temp :Int = y+z
print(temp)
    y = z
    z = temp

  }
}
}

