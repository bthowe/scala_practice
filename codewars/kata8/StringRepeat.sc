def repeatStr(times: Int, str: String): String = {
  var result = ""
  for (c <- (1 to times))
    result = result + str
  return result
}

repeatStr(4, "Hey There")

//Other solutions
//object StringRepeat {
//  def repeatStr(times: Int, str: String): String = {
//    val result = str*times
//    return result
//  }
//}