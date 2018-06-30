def potatoes(p0: Int, w0: Int, p1: Int): Int = {
  val water_weight0 = (p0 / 100f) * w0
  val dry_weight = w0 - water_weight0
  val total_weight1 = (dry_weight / (1 - (p1 / 100f)))
  "%.3f".format(total_weight1).toFloat.toInt

}
potatoes(79, 132, 78)

//Other solutions
//def potatoes(p0: Int, w0: Int, p1: Int): Int = w0 * (100 - p0) / (100 - p1)