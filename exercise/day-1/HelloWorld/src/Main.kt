fun main() {
    var litter = 0;

    while (litter < 50) {
       if(litter > 40) {
           println("Full mas "+litter);
           break
       } else {
           println(litter)
           litter += 5;
       }
    }
    println("total tanki  yang dimiliki adalah " +litter)
}

