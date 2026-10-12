// Họ tên: Ngo Quang Nhat - MSSV: 25810029

fun main() {
    val dtb: Double = 8.7

    println("Diem: $dtb")

    when (dtb) {
        in 9.0..10.0 -> println("Xuat sac")
        in 8.0..8.99 -> println("Gioi")
        in 6.5..7.99 -> println("Kha")
        in 5.0..6.49 -> println("Trung binh")
        in 0.0..4.99 -> println("Yeu")
        else -> println("Diem sai")
    }
}
