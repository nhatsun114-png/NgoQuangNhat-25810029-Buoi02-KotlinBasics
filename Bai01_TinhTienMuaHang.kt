// Họ tên: Ngo Quang Nhat - MSSV: 25810029

fun main() {
    val sl: Int = 10
    val gia: Double = 25000.0

    // phai ep kieu so luong qua double 
    val tongTien = sl.toDouble() * gia
    val thue = tongTien * 0.08
    val thanhTien = tongTien + thue

    println("Tien hang: $tongTien VND")
    println("Thue (8%): $thue VND")
    println("Tong tien phai tra: $thanhTien VND")
}
