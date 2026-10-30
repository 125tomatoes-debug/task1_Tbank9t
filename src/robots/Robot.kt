package robots

abstract class Robot (
    protected val name: String
){


    protected abstract val maxHP: Int
    protected abstract val attack: Int
    protected abstract val armor: Int

    protected abstract var hp: Int
    protected abstract var isAbilityUsed: Boolean
    protected abstract var isblockused: Boolean


    abstract fun ability(other: Robot)

    open public fun getDamage(dammage: Int): Boolean{
        hp -= dammage -  ((armor.toDouble()/100) * dammage).toInt()
        println("робот $name получет ${dammage -  ((armor.toDouble()/100) * dammage).toInt()} урона")
        if(!isAlive()){
            println("робот $name умерает")
            return false
        }else{
            return true
        }
    }

    public fun block(){
        isblockused = true
    }

    public fun isAlive(): Boolean{
        if(hp <= 0){
            return false
        }else{
            return true
        }
    }

    public fun attack(other: Robot){
        if(!other.isblockused) {
            other.getDamage(this.attack)
            println("робот $name атакует робота ${other.name}")
        }else{
            other.isblockused = false
            if(this.attack / 2 <1){
                other.getDamage(1)
                println("робот $name атакует робота ${other.name} с помехой")
            }else {
                other.getDamage(this.attack / 2)
                println("робот $name атакует робота ${other.name} с помехой")
            }
        }
    }

    public fun getRobotName(): String {
        return name
    }

    public fun showInfo(){
        println("$name [$hp/$maxHP HP]")
    }

}