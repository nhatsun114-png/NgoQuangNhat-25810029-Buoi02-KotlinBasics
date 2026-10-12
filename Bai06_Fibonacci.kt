// Họ tên: Ngo Quang Nhat - MSSV: 25810029

fun main() {
    var f1 = 0
    var f2 = 1
    
    println("vi tri 0: $f1")
    println("vi tri 1: $f2")
    
    var f3 = f1 + f2
    
    for (i in 2..50) {
        if (f3 >= 100) {
            break // chi in so < 100
        }
        println("vi tri $i: $f3")
        
        f1 = f2
        f2 = f3
        f3 = f1 + f2
    }
}
