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
 * A code to indicate the impact of the issue.
 */
public enum ImpactCode {
  /**
   * An issue occurred that resulted in the early termination of processing
   */
  FATAL,
  /**
   * An issue occurred that can be fixed by ignoring or substituting
   * incorrect values with correct values though the output will differ from
   * expectations
   */ 
  RECOVERABLE, 
  /**
   * An issue occurred which may result in output that differs from
   * expectations
   */ 
  WARNING, 
  /**
   * An issue occurred which has no impact on processing (e.g. a info message)
   */ 
  NONE  
}
