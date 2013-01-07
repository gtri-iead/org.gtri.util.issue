package org.gtri.util.issue.impl

import org.gtri.util.issue.api
import api.ImpactCode._
import scala.collection.JavaConversions._

/**
 * Created with IntelliJ IDEA.
 * User: Lance
 * Date: 1/7/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class BaseIssueHandlingStrategy extends api.IssueHandlingStrategy {
  def canContinue(i: java.util.Iterator[_ <: api.Issue]) = i.forall({ canContinue(_) })
}

class IssueHandling extends api.IssueHandling {
  def createNormalStrategy() =
    new BaseIssueHandlingStrategy {
      def canContinue(i: api.Issue) =
        i.impactCode match {
          case FATAL => false
          case RECOVERABLE => false
          case WARNING => true
          case NONE => true
        }
    }

  def createStrictStrategy() =
    new BaseIssueHandlingStrategy {
      def canContinue(i: api.Issue) =
        i.impactCode match {
          case FATAL => false
          case RECOVERABLE => false
          case WARNING => false
          case NONE => true
        }
    }


  def createLaxStrategy() =    new BaseIssueHandlingStrategy {
    def canContinue(i: api.Issue) =
      i.impactCode match {
        case FATAL => false
        case RECOVERABLE => true
        case WARNING => true
        case NONE => true
      }
  }

}