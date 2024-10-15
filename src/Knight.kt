class Knight(
    var defense:Int = 10
): Human() {
    override fun hurtSelf(p: Int) {
        super.health-=(p-defense)
        if (health<0) health = 0
    }

    override fun toString(): String {
        var hp:Int = super.health;
        return "Knight(hp = $hp, defence = $defense)"
    }
}