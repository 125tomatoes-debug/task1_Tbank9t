package robots

class TankRobot(
    name: String
):Robot(name)  {

    override val maxHP: Int = 130
    override val attack: Int = 18
    override val armor: Int = 8
    override var isAbilityUsed: Boolean = false
    override var hp: Int = maxHP
    protected var isArmorUsed: Boolean = false
    override var isblockused: Boolean = false


    override fun ability(other: Robot) {
        if(isAbilityUsed) {
            println("способность уже была использованна. два раза за бой спобность применять нельзя!")
        }else{
            isAbilityUsed = true
            isArmorUsed = true
            println("робот-танк $name использует свою способность теперь следующаяя атака по нему нанесёт менбше урона!")
        }
    }

    override fun getDamage(dammage: Int):Boolean {
        if(isArmorUsed) {
            hp -= dammage -  (((armor + 10).toDouble()/100) * dammage).toInt()
            isAbilityUsed = false
        }else{
            hp -= dammage -  ((armor.toDouble()/100) * dammage).toInt()
        }

        if(!isAlive()){
            println("робот $name умерает")
            return false
        }else{
            return true
        }
    }


}