@main
def main(): Unit = {
  var temp = 35
  println(s"${temp}C in Fahrenheit is : ${cToF(temp)}")
}

def cToF(C: Double): Double = C * 1.800 + 32
