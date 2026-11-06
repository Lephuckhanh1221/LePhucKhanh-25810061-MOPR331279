// Họ tên: Lê Phúc Khánh - MSSV: 25810061
// Dùng while khi lặp phụ thuộc vào điều kiện, dùng repeat khi biết trước số lần lặp.
fun main() {
    println("Đếm ngược từ 10 về 1 ")
    var so = 10
    while (so >= 1) {
        println(so)
        so--
    }

    println(" In dòng cố định 5 lần ")
    repeat(5) {
        println("Chào mừng bạn đến với môn Lập trình di động")
    }
}
