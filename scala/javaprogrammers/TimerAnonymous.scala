package scala.javaprogrammers

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

object TimerAnonymous {
  def oncePerSecond (callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000}
  }
  def main(args: Array[String]){
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}
