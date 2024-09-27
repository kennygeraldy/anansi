fun main() {
    val spent = 200;

    val discount = when {
        spent > 200 -> spent * 0.30
        spent > 100 && spent <= 200 -> spent * 0.20
        spent == 200 -> spent * 0.20
        spent == 50 && spent <= 100 -> spent * 0.10
        spent == 100 -> spent * 0.10
        spent < 50 -> spent.toDouble()
        else -> {
            println("No Bonuses")
            0.0
        }
    }

    val finalPrice = spent - discount;
    println("Final price: $finalPrice")
}