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

public interface Issues {
  Issue fatalError(String message);
  Issue recoverableError(String message);
  Issue warning(String message);
  Issue info(String message);
  
  DebugIssue debug(String message, int level);
  DebugIssue debug(String message);
  DebugIssue trace(String message);
  
  ExceptionIssue fatalError(Throwable cause);
  ExceptionIssue fatalError(String message, Throwable cause);
  ExceptionIssue recoverableError(Throwable cause);
  ExceptionIssue recoverableError(String message, Throwable cause);
  ExceptionIssue warning(Throwable cause);
  ExceptionIssue warning(String message, Throwable cause);

  InputLocationReport reportInputLocation(DiagnosticLocator locator);  
}
