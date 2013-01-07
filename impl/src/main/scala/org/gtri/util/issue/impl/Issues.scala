package org.gtri.util.issue.impl

import org.gtri.util.issue.api
import api.ImpactCode._
import org.apache.log4j.Level

/**
 * Created with IntelliJ IDEA.
 * User: Lance
 * Date: 1/7/13
 * Time: 4:58 PM
 * To change this template use File | Settings | File Templates.
 */
class Issues extends api.Issues {
  def fatalError(message : String) = Issue(message, FATAL)
  
  def recoverableError(message: String) = Issue(message, RECOVERABLE)

  def warning(message: String) = Issue(message, WARNING)

  def info(message: String) = Issue(message, NONE)

  def debug(message: String, level: Int) = DebugIssue(message, level)

  def debug(message: String) = DebugIssue(message, Level.DEBUG.toInt)

  def trace(message: String) = DebugIssue(message, Level.TRACE.toInt)

  def fatalError(cause: Throwable) = ExceptionIssue(cause.getMessage, cause, FATAL)

  def fatalError(message: String, cause: Throwable) = ExceptionIssue(message, cause, FATAL)

  def recoverableError(cause: Throwable) = ExceptionIssue(cause.getMessage, cause, RECOVERABLE)

  def recoverableError(message: String, cause: Throwable) = ExceptionIssue(message, cause, RECOVERABLE)

  def warning(cause: Throwable) = ExceptionIssue(cause.getMessage, cause, WARNING)

  def warning(message: String, cause: Throwable) = ExceptionIssue(message, cause, WARNING)

  def reportInputLocation(locator: api.DiagnosticLocator) = InputLocationReport(locator)
}
