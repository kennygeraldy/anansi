fun main() {
    var secretNumber = 7;
    val guess = arrayOf(5, 3, 7, 0)
    var index = 0;

    while (index < guess.size) {
        val guess = guess[index]

        if (guess == 0) {
            println("Kesempatan menebak kamu sudah berakhir.")
            break
        }

        if (guess == secretNumber) {
            println("Selamat kamu berhasil menebak secret numbernya: $secretNumber")
            break
        } else {
            println("tebakan mu adalah $guess, Kamu masih belum beruntung, coba lagi.")
        }
    index++
    }
}
