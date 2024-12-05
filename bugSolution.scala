```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct use of foldLeft to accumulate into a List
  val correctResult = list.foldLeft(List[Int]())((acc, element) => acc :+ element)
  println(s"Correct Result: $correctResult") // Output: List(1, 2, 3, 4, 5)

    //Another example that demonstrates the importance of the accumulator
  val correctResult2 = list.foldLeft(10)(_ + _)
  println(s"Correct Result2: $correctResult2") //Output: 25

  //Another example that demonstrates the importance of the accumulator
  val correctResult3 = list.foldLeft(1)(_*_)
  println(s"Correct Result3: $correctResult3") //Output: 120
}
```