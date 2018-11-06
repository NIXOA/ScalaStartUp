package main.scala.workingwthobject

/**
  * 使用scala创建类
  * 直接使用参数隐式创建构造器
  * @Author yekai
  *  @Date 2018/11/6 19:33
  */
class ScalaCar(val year : Int) {
  private var milesDriven: Int=0
  def miles: Int=milesDriven

  def driven(distance: Int): Unit ={
    milesDriven +=Math.abs(distance)
  }

}
