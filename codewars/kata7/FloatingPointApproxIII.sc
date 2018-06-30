def quadratic(a: Double, b: Double, c: Double): Double = {
//  (-b - math.sqrt(b * b - 4 * a * c)) / (2 * a)
  math.sqrt(b * b - 4 * a * c)
}


quadratic(7, 4.00e+13, 8)  // this solution didn't work


//Other solutions
//def quadratic(a: Double, b: Double, c: Double): Double = -c / b  // ...garbage

//I think I need to find the limit of the quadratic formula as b goes to infinity
