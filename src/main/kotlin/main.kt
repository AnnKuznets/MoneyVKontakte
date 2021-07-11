fun main() {
    val amount = 10_000 // сумма перевода
    val tax = 0.000075 // комиссия
    var minTax = 3_500  // мин.комиссия
    var totalTax = amount * tax

    val result = if (totalTax < minTax) minTax else totalTax
    println("Комиссия = $result копеек")


}