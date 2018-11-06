package main.scala.workingwthobject

import scala.beans.BeanProperty

/**
  * @Author yekai
  * @Date 2018/11/6 19:50
  */
class Person(val firstName : String,val lastName : String) {
  /**
    * var变量在调用之前必须初始化，
    * 使用下划线初始化变量的默认值
    * BeanProperty注解生成JavaBean
    * 规范的访问器
    */
  @BeanProperty
  var position : String=_
    println(s"Create $toString")

  /**
    * 辅助构造器
    * 调用主构造器来初始化与名字相关的字段
    * 主构造器必须放在第一行调用
    * @param firstName
    * @param lastName
    * @param positionHolder
    */
    def this (firstName:String,lastName:String,positionHolder:String){
      this(firstName,lastName)
      position=positionHolder
    }

  override def toString: String = {
    s"$firstName $lastName holds $position"
  }

}
