package com.github.tamaki.study.kwon.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach(x => if(x % 15 == 0) println("FizzBuzz") else if(x % 3 == 0) println("Fizz") else if(x % 5 == 0) println("Buzz") else if (x % 2 != 0) println(x))
  }
}
