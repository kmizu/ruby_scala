package com.github.inakata.ruby_scala
import scala.util.parsing.input.Position
import scala.util.parsing.input.Positional

/**
 * This object provide the namespace in which Ruby's AST node classes is included
 */
object RubyAst {
  abstract class Node extends Positional
  abstract class Expression extends Node
  case class SingleQuotedStringLiteral(content: String) extends Expression
  case class DoubleQuotedStringLiteral(content: String) extends Expression
  case class FixnumLiteral(content: Int) extends Expression
  case class BignumLiteral(content: BigInt) extends Expression
  case class FloatLiteral(content: Float) extends Expression
  case class DoubleLiteral(content: Double) extends Expression
  case class BooleanLiteral(content: Boolean) extends Expression
  case class ExternalCommandExecution(command: String) extends Expression
}
