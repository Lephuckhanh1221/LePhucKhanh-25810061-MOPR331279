// Họ tên: Lê Phúc Khánh - MSSV: 25810061
fun main() {
val tenHopLe: String? = "Lê Phúc Khánh"
val tenRong: String? = null

println("--- 1. Sử dụng Safe Call (?.) ---")
println("Độ dài tên hợp lệ: ${tenHopLe?.length}")
println("Độ dài tên rỗng: ${tenRong?.length}")
println("\n--- 2. Sử dụng toán tử Elvis (?:) ---")
val tenHienThi1 = tenRong ?: "Khách vãng lai"
println("Tên sau khi áp dụng Elvis cho biến null: $tenHienThi1")
println("\n--- 3. Sử dụng toán tử Not-null assertion (!!) ---")
val doDaiThucTe = tenHopLe!!.length
println("Độ dài dùng (!!): $doDaiThucTe")
}
