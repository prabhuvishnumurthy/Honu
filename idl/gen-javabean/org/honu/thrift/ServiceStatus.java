/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.honu.thrift;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

public class ServiceStatus {
  public static final int DEAD = 0;
  public static final int STARTING = 1;
  public static final int ALIVE = 2;
  public static final int STOPPING = 3;
  public static final int STOPPED = 4;
  public static final int WARNING = 5;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(
    DEAD, 
    STARTING, 
    ALIVE, 
    STOPPING, 
    STOPPED, 
    WARNING );

  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>() {{
    put(DEAD, "DEAD");
    put(STARTING, "STARTING");
    put(ALIVE, "ALIVE");
    put(STOPPING, "STOPPING");
    put(STOPPED, "STOPPED");
    put(WARNING, "WARNING");
  }};
}
