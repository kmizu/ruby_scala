package com.github.inakata.ruby_scala

import java.io.FileReader
object RubyParser {
  private[this] val parsers = new RubyParsers()
  import parsers._
  def main(args: Array[String]) {
    val reader = new FileReader(args(0))
    println(parseAll(program, reader))
  }
}
