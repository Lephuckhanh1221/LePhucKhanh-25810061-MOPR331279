// Họ tên:Lê Phúc Khánh - MSSV: 25810061
fun main() {
    val soLuong = 5
    val donGia = 15000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế VAT (8%): $thue VNĐ")
    println("Tổng tiền cuối cùng: $tongTien VNĐ")
}
