@main
def main(): Unit = {
  var r = 5
  println(s"Area of a disk of radius ${r} : ${Area(r)}")
}

def Area(r: Double): Double = math.Pi * r * r