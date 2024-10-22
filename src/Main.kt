import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var hp:Int
    var power:Int
    println("Enter Wizard's hp, power, mana:")
    hp = input.nextInt()
    power = input.nextInt()
    val mana:Int = input.nextInt()

    val wiz:Wizard = Wizard(hp,power,mana)

    println("Enter Robot's hp, power, battery:")
    hp = input.nextInt()
    power = input.nextInt()
    val battery:Int = input.nextInt()
    val rob:Robot = Robot(hp,power,battery)

    println("Enter Knight's hp, power, defense")
    hp = input.nextInt()
    power = input.nextInt()
    val defense:Int = input.nextInt()
    val kht:Knight = Knight(hp,power,defense)




    val array = arrayOf(wiz,rob,kht)

    val namesArray = arrayOf("The Wizard", "The Robot", "The Night")

    println("To attack enter the index of the attacker and the index of the defender")
    println("To heal enter the same index twice")
    println("Character's indexes:")
    println("1 - $wiz")
    println("2 - $rob")
    println("3 - $kht")

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