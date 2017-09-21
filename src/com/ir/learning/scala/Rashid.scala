package com.ir.learning.scala

object Rashid {
  def main(args: Array[String]): Unit = {
    var value : Int = 5
    val constantValue : Int = 10
    var value2 = 88
    var doubleVal = 2.0;
    //strVal = ""
    
    println("Hello Saba");
    println("Value: " + value);
    value = 8
    //sconstantValue = 17; // not possible
    
    callme("hello", value);
  }
  
  def callme(stringValue : String, value : Int): Unit = {
    println(stringValue);
    println(value);
  }
  
}