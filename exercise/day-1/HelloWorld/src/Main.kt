fun main() {
    val units = 250

    val charge = when {
        units <= 100 -> units * 1.0
        units in 101..200 -> (100 * 1.0) + ((units - 100) * 1.5)
        units > 200 -> (100 * 1.0) + (100 * 1.5) + ((units - 200) * 2.0)
        else ->
            println("Insert the correct units")
    }

    println("Total electricity bill: $$charge")
}
