// Họ tên: Lê Phúc Khánh - MSSV: 25810061
fun main() {

    val danhSachSach = mutableListOf(
        "Tủ sách danh nhân",
        "Đừng từ bỏ quá sớm",
        "Mood Book",
        "IKIGAMI",
        "BATMAN THE ULTIMATE GUIDE"
    )

    println("Danh sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("KINGDOM")
    danhSachSach.add("F THE BEST")

    danhSachSach.remove("Mood Book")

    danhSachSach.sort()

    println("\nDanh sách sau khi thêm, xoá và sắp xếp:")
    println(danhSachSach)
}
