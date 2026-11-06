// Họ tên: Lê Phúc Khánh - MSSV: 25810061
fun main() {
    val canNang = 80.0
    val chieuCao = 1.75
    val bmi = canNang / (chieuCao * chieuCao)
    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Chỉ số khối cơ thể (BMI) của bạn là: $bmi")
    println("Phân loại: $phanLoai")
}
