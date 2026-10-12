// Họ tên: Ngo Quang Nhat - MSSV: 25810029

fun main() {
    val nang: Double = 68.0 
    val cao: Double = 1.75 

    val bmi = nang / (cao * cao)
    
    println("Chi so BMI: $bmi")

    if (bmi < 18.5) {
        println("Ket qua: Gay")
    } else if (bmi < 25.0) {
        println("Ket qua: Binh thuong")
    } else if (bmi < 30.0) {
        println("Ket qua: Thua can")
    } else {
        println("Ket qua: Beo phi")
    }
}
