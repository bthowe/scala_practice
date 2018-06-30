def containAllRots(str: String, strings: List[String]): Boolean = {
  val l = str.length
  var str_roto = ""
  var lst = List()

  for (c <- (1 to l)) {
    str_roto = ""
    for (d <- (c to c + l - 1)) {
      str_roto = str_roto + str(d % l)
    }
    if (!strings.contains(str_roto)) {
      return false
    }
  }
  return true
}

var a = List("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
containAllRots("bsjq", a)
a = List("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
containAllRots("XjYABhR", a)

//Other Solutions
