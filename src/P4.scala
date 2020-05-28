package cross

case class MyClass(v1: Int, v2: Int, v3: Int) extends Product3[Int, Int, Int]
{ def _1: Int = v1
  def _2: Int = v2
  def _3: Int = v3
}
