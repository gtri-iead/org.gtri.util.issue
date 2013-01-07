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

public interface Issue {
  /**
   * Get the message
   * @return the message
   */
  String message();
  
  /**
   * Get the impact of the issue
   * @return the impact code of the issue
   */
  ImpactCode impactCode();
 
  /**
   * Get the absolute time the issue was raised. See System.currentTimeMillis
   * for details.
   */
  long timeMillis();
  
  /**
   * Get the relative time in nanoseconds at which the issue was raised. See 
   * System.nanoTime for details on the limitations of nano time.
   * @return 
   */
  long nanoTime();
  
  /**
   * Get the thread that raised the issue.
   * 
   * @return 
   */
  Thread thread();
}
