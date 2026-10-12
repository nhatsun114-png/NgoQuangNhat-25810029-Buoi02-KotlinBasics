// Họ tên: Ngo Quang Nhat - MSSV: 25810029

fun main() {
    // val la hang so nen ko the thay doi, de luu so du ban dau
    val soDuGoc: Long = 5000000L

    // var cho phep thay doi gia tri nen dung de tinh toan
    var soDu: Long = soDuGoc
    println("So du luc dau: $soDu")

    // nap 2t
    val tienGui: Long = 2000000L
    soDu += tienGui
    println("Sau khi gui $tienGui, so du la: $soDu")

    // rut 1t5
    val tienRut: Long = 1500000L
    soDu -= tienRut
    println("Sau khi rut $tienRut, so du con lai: $soDu")
}
