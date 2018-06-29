def findSmallestInt(nums:List[Int]):Int = {
  val ys = nums.sorted
  ys.head
}
findSmallestInt(List(78,56,232,12,8))


//Other solutions

//object SmallestIntegerFinder {
//  def findSmallestInt(nums:List[Int]):Int = nums.min
//}

//object SmallestIntegerFinder {
//  def findSmallestInt(nums:List[Int]):Int = {
//    nums.sorted.apply(0)
//  }
//}
