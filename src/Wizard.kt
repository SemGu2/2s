class Wizard(
    var mana:Int = 10
): Human() {
    override fun attack(h: Human) {
        if (mana>0) {
            h.hurtSelf(super.power * 2)
            mana--
        }
    }

    override fun toString(): String {
        var hp:Int = super.health;
        return "Wizard(hp = $hp, mana = $mana)"
    }
}