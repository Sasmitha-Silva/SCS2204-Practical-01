@main
def main(): Unit = {
  println(s"Total Running Time : ${easyPace(2) + tempo(3) + easyPace(2)}")
}

def easyPace(ezy: Int): Int = ezy * 8

def tempo(t: Int): Double = t * 7
