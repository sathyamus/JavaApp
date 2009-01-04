package com.snsystems;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class FileReadWrite
{
  static int instanceCount = 0;
  public FileReadWrite()
  {
    instanceCount++;
  }
  public static void main(String[] args)
  {

    // FileInputStream fis = new FileInputStream();
    FileReadWrite fileReadWrite1 = new FileReadWrite();
    System.out.println("Welcome");
  }

}
