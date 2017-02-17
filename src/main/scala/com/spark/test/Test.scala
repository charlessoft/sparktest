package com.spark.test

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by charles on 2017/2/17.
  */
object Test {
  def main(args: Array[String]) {
    println("Hello World!")
    val sparkConf = new SparkConf().setMaster("spark://192.168.6.2:7070").setAppName("test")
    val sc = new SparkContext(sparkConf)
    val wx = sc.textFile("/tmp/1.txt")
    println(wx.count())
  }
}
