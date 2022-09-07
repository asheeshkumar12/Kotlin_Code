class Dog(var breath:String, var color:String, var age:Int){
    
    fun eat(){
        println(" $breath is eating food ")
    }
    fun bark(){
        println("$breath is barking at new person entre in the hall")
    }
}
fun main()
{
    val dog1= Dog ("Labrador","Brown",12)
    dog1.eat()
    dog1.bark()
    println(dog1.breath)
    println(dog1.color)
    println(dog1.age)
    
    val dog2=Dog("German","Black",30)
    dog2.eat()
    dog2.bark()
    println(dog2.breath)
    println(dog2.color)
    println(dog2.age)
}
