package scala.school.concurrency

/**
  * Created by oscartorrenotirado on 12/2/17.
  */

import java.util.concurrent.{BlockingQueue, LinkedBlockingQueue}

import scala.collection.mutable
import scala.io.Source

case class User(name: String, id: Int)

class InvertedIndex(val userMap: mutable.Map[String, User]) {

  def this() = this(new mutable.HashMap[String, User])

  def tokenizeName(name: String): Seq[String] = {
    name.split(" ").map(_.toLowerCase)
  }

  def add(term: String, user: User) {
    userMap += term -> user
  }

  def add(user: User) {
    tokenizeName(user.name).foreach { term =>
      add(term, user)
    }
  }
}

/*
// Concrete producer
class Producer[String](path: String, queue: BlockingQueue[String]) extends Runnable {
  def run() {
    Source.fromFile(path, "utf-8").getLines.foreach { line =>
      queue.put(line)
    }
  }
}

// Abstract consumer
abstract class Consumer[String](queue: BlockingQueue[String]) extends Runnable {
  def run() {
    while (true) {
      val item = queue.take()
      consume(item)
    }
  }

  def consume(x: String)
}

val queue = new LinkedBlockingQueue[String]()

// One thread for the producer
val producer = new Producer[String]("users.txt", q)
new Thread(producer).start()

trait UserMaker {
  def makeUser(line: String) = line.split(",") match {
    case Array(name, userid) => User(name, userid.trim().toInt)
  }
}

class IndexerConsumer(index: InvertedIndex, queue: BlockingQueue[String]) extends Consumer[String](queue) with UserMaker {
  def consume(t: String) = index.add(makeUser(t))
}

// Let's pretend we have 8 cores on this machine.
val cores = 8
val pool = Executors.newFixedThreadPool(cores)

// Submit one consumer per core.
for (i <- i to cores) {
  pool.submit(new IndexerConsumer[String](index, q))
}
*/