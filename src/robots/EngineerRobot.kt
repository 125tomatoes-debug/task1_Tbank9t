package robots

import kotlin.math.max

class EngineerRobot(
    name: String
) :Robot(name) {

    override val maxHP: Int = 90
    override val attack: Int = 16
    override val armor: Int = 3
    override var isAbilityUsed: Boolean = false
    override var hp: Int = maxHP
    override var isblockused: Boolean = false

    override fun ability(other: Robot) {
        if(!isAbilityUsed) {
            if(hp + 25 < maxHP){
                hp += 25
            }else{
                hp = maxHP
            }
            println("робот-инженер $name ипользует свою способность и теперь его hp = $hp")
        }else{
            println("способность уже была использованна. два раза за бой спобность применять нельзя!")
        }
    }
}