package com.eaton.study.basics

import scala.io.Source

/**
  * Created by eaton on 11/2/2017.
  */
object FileOps {
    def main(args: Array[String]): Unit = {

        // 从网络资源中读取数据
        if(false){
            val file = Source.fromURL("http://www.scala-lang.org/")
            for(line <- file.getLines()) println(line)
        }

        // 从文件中读取数据
        if(false){
            val filePath: String = "E:\\scala_proj\\hello.txt"
            val fileContent = Source.fromFile(filePath)
            for (line <- fileContent.getLines()) println(line)
        }
    }
}
