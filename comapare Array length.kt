import java.util.*
fun main() {
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

// Create compareArrayLength() function here
fun compareArrayLength(a:Array<string>,b:Array<String>) :Boolean {
    return a.length==b.length
}
