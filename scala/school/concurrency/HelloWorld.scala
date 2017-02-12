package scala.school.concurrency

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val hello = new Thread(new Runnable {
      def run(): Unit = {
        println("HelloWorld")
      }
    })

    hello.start
  }
}