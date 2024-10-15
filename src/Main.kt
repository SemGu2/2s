import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    println("Enter Wizard's mana:")
    val mana:Int = input.nextInt()

    println("Enter Robot's battery:")
    val battery:Int = input.nextInt()

    println("Enter Knight's defense")
    val defense:Int = input.nextInt()

    val wiz:Wizard = Wizard(mana)
    val rob:Robot = Robot(battery)
    val kht:Knight = Knight(defense)

    val array = arrayOf(wiz,rob,kht)
    val namesArray = arrayOf("The Wizard", "The Robot", "The Night")

    println("To attack enter the index of the attacker and the index of the defender")
    println("To heal enter the same index twice")
    println("Character's indexes:")
    println("1 - Wizard")
    println("2 - Robot")
    println("3 - Knight")

    while (array[0].health>0 && array[1].health>0 && array[2].health>0)
    {
        val player1Num = input.nextInt()-1
        val player2Num = input.nextInt()-1
        if (player2Num != player1Num) {
            val player1: Human = array[player1Num]
            val player2: Human = array[player2Num]
            val pl1Name = namesArray[player1Num]
            val pl2Name = namesArray[player2Num]
            val hpBefore = player2.health
            player1.attack(player2)
            val dmg = hpBefore - player2.health
            println("$pl1Name attacks $pl2Name dealing $dmg damage!")
        }
        else
        {
            val player: Human = array[player1Num]
            val plName = namesArray[player1Num]
            val healPoints = player.heal()
            println("$plName heals for $healPoints!")
        }
    }

    Arrays.sort(array)
    println("Leaderboard:")
    println(array[2])
    println(array[1])
    println(array[0])



}