fun main(){
    val a= listOf("Ram","Raja","Rani")
    println(a.size)
    println(a.indexOf("Raja"))
    println(a[2])
    for(i in a.indices){
        println(a[i])
    }
    println(a)

    println(" New Line Here")

    val number=listOf(1,2,3,4,1,9,0,1,3,5,7,8)
    println(number.size)
    println(number.get(5))
    println(number[6])
    println("index of 1 is ${number.indexOf(1)}")
    println("last index of 1 is ${number.lastIndexOf(1)}")
    println("last inedx of list ${number.lastIndex}")
    println(number.first())
    println(number.last())

    println(" New All List In kotlin ")
    val imll=listOf("Lionel Messi","Wayne Rooney","ka Modric","den Hazard","ergio Aguero")
    print(imll)
    println()
    val mll=mutableListOf("Lionel Messi","Wayne Rooney","ka Modric","den Hazard","ergio Aguero")
    println(mll)
    val arrList=arrayListOf("Lionel Messi","Wayne Rooney","ka Modric","den Hazard","ergio Aguero")
    println(arrList)


}
