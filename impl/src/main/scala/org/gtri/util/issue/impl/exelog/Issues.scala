package org.gtri.util.issue.impl.exelog

import org.gtri.util.issue.impl.{InputLocationReport, ExceptionIssue, DebugIssue, Issue}
import org.gtri.util.issue.api.ImpactCode._
import org.apache.log4j.Level
import org.gtri.util.issue.api
import org.gtri.util.scala.exelog.MethodLog

/**
 * Created with IntelliJ IDEA.
 * User: Lance
 * Date: 1/7/13
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
object Issues {
  private val issues = new org.gtri.util.issue.impl.Issues()

  def fatalError(message : String)(implicit log : MethodLog) = {
    log.fatal(message)
    issues.fatalError(message)
  }

  def recoverableError(message: String)(implicit log : MethodLog) = {
    log.error(message)
    issues.recoverableError(message)
  }

  def warning(message: String)(implicit log : MethodLog) = {
    log.warn(message)
    issues.warning(message)
  }

  def info(message: String)(implicit log : MethodLog) = {
    log.info(message)
    issues.info(message)
  }

  def debug(message: String, level: Int)(implicit log : MethodLog) = {
    if(level >= Level.DEBUG.toInt) {
      log.debug(message)
    } else {
      log.trace(message)
    }
    issues.debug(message, level)
  }

  def debug(message: String)(implicit log : MethodLog) = {
    log.debug(message)
    issues.debug(message)
  }

  def trace(message: String)(implicit log : MethodLog) = {
    log.trace(message)
    issues.trace(message)
  }

  def fatalError(cause: Throwable)(implicit log : MethodLog) = {
    log.fatal(cause)
    issues.fatalError(cause)
  }

  def fatalError(message: String, cause: Throwable)(implicit log : MethodLog) = {
    log.fatal(message)
    issues.fatalError(message)
  }

  def recoverableError(cause: Throwable)(implicit log : MethodLog) = {
    log.error(cause)
    issues.recoverableError(cause)
  }

  def recoverableError(message: String, cause: Throwable)(implicit log : MethodLog) = {
    log.error(message, cause)
    issues.recoverableError(message, cause)
  }

  def warning(cause: Throwable)(implicit log : MethodLog) = {
    log.warn(cause)
    issues.warning(cause)
  }

  def warning(message: String, cause: Throwable)(implicit log : MethodLog) = {
    log.warn(message, cause)
    issues.warning(message, cause)
  }

  def reportInputLocation(locator: api.DiagnosticLocator)(implicit log : MethodLog) = {
    val retv = issues.reportInputLocation(locator)
    log.info(retv.toString)
    retv
  }

}
