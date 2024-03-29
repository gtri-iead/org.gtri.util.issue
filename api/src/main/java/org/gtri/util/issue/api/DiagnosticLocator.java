/*
    Copyright 2012 Georgia Tech Research Institute

    Author: lance.gatlin@gtri.gatech.edu

    This file is part of org.gtri.util.issue library.

    org.gtri.util.issue library is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    org.gtri.util.issue library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with org.gtri.util.issue library. If not, see <http://www.gnu.org/licenses/>.

*/
package org.gtri.util.issue.api;

/**
 * An interface for an immutable diagnostic locator message. An 
 * ImmutableDiagnosticLocator can be converted to a string and prepended to 
 * messages to provide the user or administrator with the information necessary 
 * to locate the source of any issues within the input supplied, such as the XML 
 * file name and line number or the database name, table and record, etc.
 * 
 * The ImmutableDiagnosticLocator may also be downcast to a more specific 
 * implementation (e.g. TextFileLocator)
 *
 * @author lance.gatlin@gmail.com
 */
public interface DiagnosticLocator {

  /**
   * Get a diagnostic locator string that can be prepended to messages.
   * @return a diagnostic locator string that can be prepended to messages.
   */
  @Override public String toString();
  
  public static final DiagnosticLocator nowhere = new DiagnosticLocator() {
    @Override public String toString() { return ""; }
  };
  
}
