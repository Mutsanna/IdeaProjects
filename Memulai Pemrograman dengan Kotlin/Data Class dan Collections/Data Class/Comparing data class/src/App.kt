data class DataUser(val name : String, val address : String)

fun main(){
    val dicoding = DataUser(name = "Dicoding Indonesia", address = "Bandung")

    println(dicoding.component1())
    println(dicoding.address)

}