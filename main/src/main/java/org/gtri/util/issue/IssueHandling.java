/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gtri.util.issue;

/**
 *
 * @author lance.gatlin@gmail.com
 */
public interface IssueHandling {
  public static org.gtri.util.issue.api.IssueHandling INSTANCE = new org.gtri.util.issue.impl.IssueHandling();  
}
