object Test{

  def sum(xs: List[Int]): Int = {
    def loop (acc: Int, xs: List[Int]): Int = {
      if(xs.isEmpty) acc else loop(acc+xs.head, xs.tail)
    }
    loop(0,xs)
  }

  def max(xs: List[Int]): Int={
    def loop (current_max: Int, xs: List[Int]): Int = {
      if(xs.isEmpty) current_max
      else
          if(xs.head>current_max) loop(xs.head,xs.tail)
      else loop(current_max,xs.tail)
    }
    loop(0,xs)
  }

  val my_list = List(1,2,3)
  sum(my_list)
}