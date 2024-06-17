@main
def main(): Unit = {
  println(s"Total Wholesale Cost : ${discountedBookPrice(60) + shipCost(60)}")
}

def discountedBookPrice(n: Double): Double = n * 24.95 * .6

// Assume that the shipping cost of an additional book is Rs. 0.75
def shipCost(c: Int): Double = if (c > 50) (50 * 3) + (c - 50) * .75 else c * 3
