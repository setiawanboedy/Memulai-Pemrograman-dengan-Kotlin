fun main() {

    //just try by my self
    val message: String? = null
    message?.let {
        val length = it.length*2
        val text = "text lenght $length"
        println(text)
    }?:run {
        val text = "message is null"
        println(text)
    }
}