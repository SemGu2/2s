class Wizard(
    hp:Int,
    pwr:Int,
    var mana:Int = 10
): Human(hp,pwr) {
    override fun attack(h: Human) {
        if (mana>0) {
            h.hurtSelf(super.power * 2)
            mana--
        }
        else
        {
            h.hurtSelf(super.power)
        }
    }

    override fun toString(): String {
        val hp:Int = super.health
        val pwr:Int = super.power
        return "Wizard(hp = $hp, power = $pwr, mana = $mana)"
    }
}