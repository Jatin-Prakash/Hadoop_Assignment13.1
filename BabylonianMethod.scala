object BabylonianMethod {
  def main(args: Array[String]): Unit = {

    getSquareRoot(25 , 1, 0.0001F)
  }


  def getSquareRoot(number:Int , choosenNumber: Int, approx : Float):Int = {

    var x = number
    var z = choosenNumber
    while(x - z >approx){

      x = (x + z)/2
      z = number/x
      println(x+" "+z)
    }

    print(x)
    return x
  }
}