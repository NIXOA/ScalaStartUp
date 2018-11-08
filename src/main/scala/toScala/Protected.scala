package main.scala.toScala

/**
  * protected关键字修饰的成员只能在其派生类中访问
  * @Author yekai
  * @Date 2018/11/6 19:15
  */
class Protected {

  class Vehicle{
    protected def checkEngine(){}
  }

  class Car extends Vehicle{
    def start(){checkEngine()}
    def two(car:Car): Unit ={
      car.checkEngine()
    }
    def two(vehicle: Vehicle): Unit ={
      //编译错误，不能在Car的实例中通过Vehicle的实例访问
     // vehicle.checkEngine();
    }
  }

}
