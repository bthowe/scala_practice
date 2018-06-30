def isAlphabetic(s: String): Boolean = {
  if (s.length == 0)
    return true
  else {
    var current_val = s(0)
    for (c <- s.drop(1)) {
      if ((c >= current_val)) {
        current_val = c
      }
      else {
        return false
      }
    }
    true
  }
}
isAlphabetic("asd")
isAlphabetic("abc")
isAlphabetic("abcdefgh")
isAlphabetic("door")
isAlphabetic(" ")
isAlphabetic("")

//Other solutions
//def isAlphabetic(s: String): Boolean = s.sorted == s  // clever