// Họ tên: Lê Phúc Khánh - MSSV: 25810061
fun main() {
    val diemSinhVien = arrayOf(5.5, 7.0, 8.0, 4.5, 10.0, 7.5, 7.5, 6.5, 9.5, 3.0)
        var tongDiem = 0.0
    var diemCaoNhat = diemSinhVien[0]
    var diemThapNhat = diemSinhVien[0]
    for (diem in diemSinhVien) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }
    val diemTrungBinh = tongDiem / diemSinhVien.size
    println("Điểm trung bình: $diemTrungBinh")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
