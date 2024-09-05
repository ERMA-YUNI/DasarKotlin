fun main(args: Array<String>) {
    val s ="Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("will shadow be turned on")
    println(config.contains("shdows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("would the player like to use autoseve?")
    println(config.contains("autosave"))

    var strJava = "Java is the best!"
    strJava = strJava.replace("java","kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    println("I wold  not banish all of these  Internets.".substring(2, 7))

    println("alpa".compareTo("bravo"))

}