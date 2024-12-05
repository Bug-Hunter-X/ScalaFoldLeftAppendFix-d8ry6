```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect use of foldLeft, attempting to append to an Int
  val result = list.foldLeft(0)(_ + _)
  println(result) // Output: 15

  //Correct implementation using foldLeft to append to a List
 val result2 = list.foldLeft(List[Int]())((acc,ele)=> acc :+ ele)
  println(result2) // Output: List(1, 2, 3, 4, 5)

  //Another common error in foldLeft is not understanding the accumulator
 val result3 = list.foldLeft(10)(_ * _)
 println(result3)// Output: 1200

}