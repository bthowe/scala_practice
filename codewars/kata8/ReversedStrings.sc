def solution(word: String): String = {
  var new_string = ""
  for (c <- word)
    new_string = c + new_string
  return new_string
}
solution("Hey There")


//Other solutions

//object Kata {
//  def solution(word: String): String = {
//    word.reverse
//  }
//}
