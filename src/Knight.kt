class Knight(
    hp:Int,
    pwr:Int,
    var defense:Int = 10
    ): Human(hp,pwr) {
    override fun hurtSelf(p: Int) {
        super.health-=(p-defense)
        if (health<0) health = 0
    }

    override fun toString(): String {
        val hp:Int = super.health;
        val pwr:Int = super.power
        return "Knight(hp = $hp,power = $pwr, defence = $defense)"
    }
}