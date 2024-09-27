fun main() {
    var score = arrayOf(50, 65,75,85,95);
    for (x in score) {
        if (x >= 90) {
            println("Score = A")
        } else if (x >= 80 && x < 90) {
            println("Score = B")
        }else if (x >= 70 && x < 80) {
            println("Score = C")
        }else if (x >= 60 && x < 69) {
            println("Score = D")
        }else if (x < 60) {
            println("Score = F")
        } else {
            println("Insert valid score;")
        }
    }
}