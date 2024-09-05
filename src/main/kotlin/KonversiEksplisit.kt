fun main(args: Array<String>) {
    val  valInt: Int = 1
    val valSum: Long = 3L + valInt
    println("Konversi variabel valInt secara implisit : " +valSum)
    val vaLong: Long = valInt.toLong()
    println("Konversi variabel valInt secara eksplisit : " +vaLong)
}