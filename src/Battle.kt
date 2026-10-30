import robots.Robot

class Battle (
    val rb1: Robot,
    val rb2: Robot,
){
    private var isPl1: Boolean = true
    public fun startBattle() {
        var roundCount = 1
        while(rb1.isAlive() && rb2.isAlive()){
            println("РАУНД $roundCount")
            rb1.showInfo()
            rb2.showInfo()
            turn(isPl1)
            if(isPl1){
                isPl1 = false
            }else{
                isPl1 = true
            }
            roundCount++
        }
    }


    private fun turn(isPl1: Boolean){
        if(isPl1){
            println("Ход робота ${rb1.getRobotName()}:\n" +
                    "1. Атака\n" +
                    "2. Защита\n" +
                    "3. Способность")
            val turn: Int = readln().toInt() % 3
            if(turn == 1){
                rb1.attack(rb2)
            }
            if(turn == 2){
                rb1.block()
            }
            if(turn == 0){
                rb1.ability(rb2)
            }
            if(!rb2.isAlive()){
                println("побода ${rb1.getRobotName()}")
            }
        }else{
            println("Ход робота ${rb2.getRobotName()}:\n" +
                    "1. Атака\n" +
                    "2. Защита\n" +
                    "3. Способность")
            val turn: Int = readln().toInt() % 3
            if(turn == 1){
                rb2.attack(rb1)
            }
            if(turn == 2){
                rb2.block()
            }
            if(turn == 0){
                rb2.ability(rb1)
            }
        }
        if(!rb1.isAlive()){
            println("побода ${rb2.getRobotName()}")
        }
    }
}
