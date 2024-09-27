fun main() {
    val salaries = 1000000;
    val duration = 6;

    val bonus = when {
        duration > 5 -> salaries * 0.20
        duration == 2 || duration == 5 -> salaries * 0.10
        duration < 10 -> salaries.toDouble()
        else -> {
            println("No Bonuses")
            0.0
        }
    }

    println("Bonus: $bonus")
}