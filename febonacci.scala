object febonacci {
  def main(args: Array[String]): Unit = {
    println("hello scala")
    var num: Int = 1
    var y: Int = 1
    var z: Int = 2
    print(y)
    print(z)
    febonacciRecursive(num,y,z)
    println("")
    febonacciSeries(7)
  }

  def febonacciSeries(x: Int) = {


    var y: Int = 1
    var z: Int = 2
    print(y)
    print(z)
    for (i <- 1 to x) {
      var temp: Int = y + z
      print(temp)
      y = z
      z = temp

    }
  }


  def febonacciRecursive(num: Int, y:Int, z:Int): AnyVal = {

    var a = y
    var b = z

    if (num < 55) {

      var temp: Int = a + b
      print(temp)
      a = b
      b = temp
      febonacciRecursive(temp,a,b )
    }
  }

}