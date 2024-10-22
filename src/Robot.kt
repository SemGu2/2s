class Robot(
    hp:Int,
    pwr:Int,
    var battery:Int = 100
): Human(hp,pwr) {

    override fun attack(h: Human) {
        h.hurtSelf(super.power/10*battery)
        battery--
    }

    override fun toString(): String {
        val hp:Int = super.health;
        val pwr:Int = super.power;
        return "Robot(hp = $hp, power = $pwr, battery = $battery)"
    }
}