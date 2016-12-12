package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else  pascal(c, r - 1) + pascal(c - 1, r - 1)
    }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var blnc_cnt = 0;
    def loop (xs: List[Char]): Boolean = {
      if (!xs.isEmpty){
        if(blnc_cnt<0) false
        else{
          if(xs.head=='('){ blnc_cnt+=1; loop(xs.tail)}
          else if(xs.head==')'){ blnc_cnt-=1; loop(xs.tail)}
          else loop(xs.tail)
        }
      }else {
        if (blnc_cnt==0) true
        else false
      }
    }
    if (chars.isEmpty) throw new NoSuchElementException("Empty input string")
    loop(chars)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
        if (money < 0) 0
        else if (coins.isEmpty) if (money == 0) 1 else 0
        else  countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }

  }
