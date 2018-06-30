def testit(a: Int, b: Int): Int = {
  if ((a - b) == a | (a - b) == b) {
    return a + b
  }
  else {
    return a * b
  }
}
testit(6, 7)

//a = 2, b = 2 => 2
//a = 11, b = 22 => 31
