data class DataUser(val name : String, val age : Int)

fun main() {
    println("Data Class")
    val user = DataUser("sinaga", 12)
    val nameUser = user.name
    val ageUser = user.age

    println("Hello, My name is $nameUser i'm $ageUser years old")
}