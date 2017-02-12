package scala.school.concurrency

import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicReference

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

//Synchronization
class Person(var name: String) {
  def set(changedName: String) {
    this.synchronized {
      name = changedName
    }
  }
}

class Person2(@volatile var name: String) {
  def set(changedName: String) {
    name = changedName
  }
}

class Person3(val name: AtomicReference[String]) {
  def set(changedName: String) {
    name.set(changedName)
  }
}

object CountDown {
  def main(args: Array[String]): Unit = {
    val doneSignal = new CountDownLatch(2)
    //doAsyncWork(1)
    //doAsyncWork(2)

    doneSignal.await()
    println("both workers finished!")
  }
}