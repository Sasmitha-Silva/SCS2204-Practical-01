@main
def main(): Unit = {
  var r = 5
  println(s"Volume of a Sphere With Radius of $r : ${volSphere(r)}")
}

def volSphere(r: Double): Double = r * r * r * math.Pi * 4 / 3
