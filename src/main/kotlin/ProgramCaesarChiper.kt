fun main(args: Array<String>) {
    val s = "blanckholessareheregoddividedbyzero"
    println("Original mesege:$s")
    var message = ""
    var shift = 1

    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char

    }

    println("Encryted mesage: $message")
}
