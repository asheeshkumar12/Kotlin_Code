// Create your class here
data class Student(var name:String,var rollnumber:Int,var percentage:Double){
    // fun printall(){
    //     println("$name is mark $percentage that is rollnumber $rollnumber ")
    // }
}

fun main() {
    // write your code here
    val s1=Student("Ak",123,38.90)
    val s2=Student("sonam",133,24.23)
    val s3=Student("mittal",123,30.23)
    val s4=Student("neha",153,94.23)
    val s5=Student("neelam",163,86.40)
    val s6=Student("koshami",173,32.45)
    val s7=Student("roshani",113,37.79)
    val s8=Student("janhni",193,78.90)
    val s9=Student("mona",103,67.90)
    val s10=Student("Astha",153,99.10)
//     s1.printall()
//     s2.printall()
//     s3.printall()
//     s4.printall()
//     s5.printall()
       println(s1)
    println("by Muatablelist")
    var listmute=mutableListOf(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10)
    for(i in listmute){
        println(i)
    }
    
                
                
    
}
