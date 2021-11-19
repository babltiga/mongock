package io.mongock.utils;

import java.util.stream.Stream;

//TODO move to util module
public final class StringUtils {

  private StringUtils() {
  }

  public static boolean hasText(String str) {
    if (str == null || str.isEmpty()) {
      return false;
    }
    int strLen = str.length();
    for (int i = 0; i < strLen; i++) {
      if (!Character.isWhitespace(str.charAt(i))) {
        return true;
      }
    }
    return false;
  }

  public static String getSimpleClassName(String changeLogClass) {
    String[] splitIn = changeLogClass.split("\\.");
    return splitIn[splitIn.length - 1];
  }

  public static String getStackTrace(Throwable th) {
    StackTraceElement[] ste = th.getStackTrace();
    StringBuilder sb = new StringBuilder(th.getClass().getName()).append(": ").append(th.getMessage()).append("\n");
    Stream.of(ste).forEach(e -> sb.append(e).append("\n"));
    return sb.toString();
  }
}