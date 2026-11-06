// Họ tên: Lê Phúc Khánh - MSSV: 25810061
fun main() {
    var f0 = 0
    var f1 = 1

    println("Vị trí 0: $f0")
    println("Vị trí 1: $f1")

    for (i in 2..20) {
        val fNext = f0 + f1
        if (fNext >= 100) {
            break
        }

        println("Vị trí $i: $fNext")

        f0 = f1
        f1 = fNext
    }
}
