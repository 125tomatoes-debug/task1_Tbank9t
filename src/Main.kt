import Battle
import robots.AttakRobot
import robots.EngineerRobot
import robots.Robot
import robots.TankRobot
import java.util.Locale
import java.util.Locale.getDefault
import kotlin.math.abs
import kotlin.math.max


fun main() {
    val rb1: Robot
    val rb2: Robot
    println("Первый игрок, выберите тип робота: Штурмовик(1), Танк(2), Инженер(3)")
    var robotchosen: Int = readln().toInt()
    println("дайте ему имя")
    var name1: String = readln()
    if(robotchosen % 3 == 1){
        rb1 = AttakRobot(name1)
        println("наши пощдровления! вы выбрали атакующую модель!")
    }else if(robotchosen % 3 == 2){
        rb1 = TankRobot(name1)
        println("наши пощдровления! вы выбрали модель танка!")
    }else{
        rb1 = EngineerRobot(name1)
        println("наши пощдровления! вы выбрали инженерную модель!")
    }

    println("Второй игрок, выберите тип робота: Штурмовик(1), Танк(2), Инженер(3)")
    robotchosen= readln().toInt()
    println("дайте ему имя")
    var name2: String = readln()
    if(robotchosen % 3 == 1){
        rb2 = AttakRobot(name2)
        println("наши пощдровления! вы выбрали атакующую модель!")
    }else if(robotchosen % 3 == 2){
        rb2 = TankRobot(name2)
        println("наши пощдровления! вы выбрали модель танка!")
    }else{
        rb2 = EngineerRobot(name2)
        println("наши пощдровления! вы выбрали инженерную модель!")
    }

    println("бой начинается!!!")
    val battle: Battle = Battle(rb1, rb2)
    battle.startBattle()
}


