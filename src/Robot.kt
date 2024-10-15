class Robot(
    var battery:Int = 100
): Human() {

    override fun attack(h: Human) {
        h.hurtSelf(super.power/10*battery)
        battery--
    }

    override fun toString(): String {
        var hp:Int = super.health;
        return "Robot(hp = $hp, battery = $battery)"
    }
}