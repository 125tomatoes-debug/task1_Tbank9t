package robots

class AttakRobot(
    name: String
) : Robot(name) {
    override val maxHP: Int = 100
    override val attack: Int = 25
    override val armor: Int = 4
    override var isAbilityUsed: Boolean = false
    override var hp: Int = maxHP
    override var isblockused: Boolean = false

    override fun ability(other: Robot) {
        if(!isAbilityUsed) {
            other.getDamage(attack * 2)
            isAbilityUsed = true
            println("робот-Штурмовик $name использует свою способность и наносит 50 урона!")
        }else{
            println("способность уже была использованна. два раза за бой спобность применять нельзя!")
        }
    }
}