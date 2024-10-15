abstract class Human(
    var health:Int = 100,
    var power:Int = 10
): Comparable<Human> {

    override fun compareTo(other: Human): Int
    {
        if (health == other.health){
            return 0
        } else if (health > other.health)
        {
            return 1
        } else
        {
            return -1
        }
    }

    open fun attack(h:Human)
    {
        h.hurtSelf(power)
    }

    open fun hurtSelf(p:Int)
    {
        health-=p
        if (health<0) health = 0
    }

    fun heal():Int {
        var x = Math.ceil(Math.random() * 100) % 16
        health += x.toInt()
        return x.toInt()
    }
}