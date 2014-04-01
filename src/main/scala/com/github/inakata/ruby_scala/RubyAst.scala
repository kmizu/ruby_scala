package com.github.inakata.ruby_scala

/**
 * This object provide the namespace in which Ruby's AST node classes is included
 */
object RubyAst {
  case class Position(line: Int, column: Int)
  abstract class Node(position: Position)
  abstract class Expression(position: Position) extends Node(position)
  case class RawStringLiteral(content: String, position: Position) extends Expression(position)
  case class FixnumLiteral(content: Int, position: Position) extends Expression(position)
  case class BignumLiteral(content: BigInt, position: Position) extends Expression(position)
  case class FloatLiteral(content: Float, position: Position) extends Expression(position)
  case class DoubleLiteral(content: Double, position: Position) extends Expression(position)
  case class BooleanLiteral(content: Boolean, position: Position) extends Expression(position)
  case class ExternalCommandExecution(command: String, position: Position) extends Expression(position)
}
