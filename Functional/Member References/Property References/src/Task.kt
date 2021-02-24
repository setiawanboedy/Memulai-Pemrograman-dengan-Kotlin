var alert = "Kotlin"

fun main() {
    println(::alert.name)
    println(::alert.get())

    ::alert.set("Kotlin Academy")

    println(::alert.get())
}