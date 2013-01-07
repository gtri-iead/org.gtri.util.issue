package org.gtri.util.issue.impl

import org.gtri.util.issue.api
import api.DiagnosticLocator

/**
 * Created with IntelliJ IDEA.
 * User: Lance
 * Date: 1/7/13
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */
case class FileLocator(file : Option[String], line : Int, column : Int) extends DiagnosticLocator {
  override def toString = {
    val filestr =
      file match {
        case Some(file) => file + " "
        case None => ""
      }
    "[" + filestr + line + ":" + column + "]"
  }
}