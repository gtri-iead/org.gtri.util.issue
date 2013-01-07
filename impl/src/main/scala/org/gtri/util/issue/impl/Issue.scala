package org.gtri.util.issue.impl

import org.gtri.util.issue.api
import api.ImpactCode._

/**
 * Created with IntelliJ IDEA.
 * User: Lance
 * Date: 1/7/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class BaseIssue extends api.Issue {
  val timeMillis : Long = System.currentTimeMillis()
  val nanoTime : Long = System.nanoTime()
  val thread : Thread = Thread.currentThread()
}

case class Issue(message : String, impactCode : api.ImpactCode) extends BaseIssue
case class ExceptionIssue(message : String, exception : Throwable, impactCode : api.ImpactCode) extends BaseIssue with api.ExceptionIssue
case class DebugIssue(message : String, level : Int) extends BaseIssue with api.DebugIssue {
  def impactCode = NONE
}
case class InputLocationReport(locator : api.DiagnosticLocator) extends BaseIssue with api.InputLocationReport {
  def message = locator.toString

  def impactCode = NONE
}