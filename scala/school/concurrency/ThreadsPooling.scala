package scala.school.concurrency

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

import java.net.{Socket, ServerSocket}
import java.util.concurrent.{Executors, ExecutorService}
import java.util.Date

class NetworkService(port: Int, poolSize: Int) extends Runnable {
  val serverSocket = new ServerSocket(port)
  val pool: ExecutorService = Executors.newFixedThreadPool(poolSize)

  def run() {
    try {
      while (true) {
        // This will block until a connection comes in.
        val socket = serverSocket.accept()
        pool.execute(new Handler(socket))
      }
    } finally {
      pool.shutdown()
    }
  }
}

class Handler(socket: Socket) extends Runnable {
  def message = (Thread.currentThread.getName() + "\n").getBytes

  def run() {
    socket.getOutputStream.write(message)
    socket.getOutputStream.close()
  }
}

object Test {
  def main(args: Array[String]){
    (new NetworkService(2020, 2)).run
  }
}

//nc localhost 2020 in the command line to connect to it

//Future
/*
val future = new FutureTask[String](new Callable[String]() {
  def call(): String = {
    searcher.search(target);
}})
executor.execute(future)

val blockingResult = Await.result(future)
 */