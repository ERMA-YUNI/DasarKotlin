fun main(args: Array<String>) {
    var s = "A  programer gets stuck in the shower because the intruction  on the shampoo were: Lather, \n" +
            "Wash, and Repeat."
    println(s)
    s = s.toLowerCase()
    var vowelCount = 0
    var consonantCount = 0
    var vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c))
            consonantCount++

        println("Vowels: $vowelCount")
        println("Consonants: $consonantCount")
        println("Other characters: ${s.length - (vowelCount + consonantCount)}")
    }
}


