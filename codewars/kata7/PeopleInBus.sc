val str = "kassie"
str.drop(2)
str.take(2)

def number(busStops: List[(Int, Int)]): Int = {
  var remaining = 0
  for (c <- busStops) {
    remaining = (c._1 - c._2) + remaining
  }
  return remaining
}

number(List((10, 0), (3, 5), (5,8)))
number(List((3, 0), (9, 1), (4, 10), (12, 2), (6, 1), (7, 10)))

//Other solutions
//def number(busStops: List[(Int, Int)]): Int = {
//  busStops.map{case (on, off) => on - off}.sum
//}

//def number: List[(Int, Int)] => Int = _.map(people => people._1 - people._2).sum