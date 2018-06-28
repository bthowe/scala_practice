def loveVsFriendship(s: String): Int = {
  val letter_map = (('a' to 'z').toList zip (1 to 26).toList).toMap
  var string_val = 0
  for (c <- "hello")
    string_val += letter_map(c)
  return string_val
}

loveVsFriendship("hello")

//Good solution from website
//def loveVsFriendship(s: String): Int = {
//  s.map(c => c - 'a' + 1).sum
//}
