package scala.school.basics

/**
  * Created by oscartorrenotirado on 11/2/17.
  */

import java.io.{BufferedReader, FileNotFoundException, FileReader, IOException}

object Exceptions {
  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
      val br = new BufferedReader(f)
      var line = br.readLine()
      while (line != null) {
        println(line)
        line = br.readLine()
      }
      br.close()
      f.close()
    } catch {
      case ex : FileNotFoundException =>
        println("Missing file exception")
        ex.printStackTrace()
      case _ : IOException =>
        println("IO Exception")
    } finally {
      println("Finally!")
    }
  }
}