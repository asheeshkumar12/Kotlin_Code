// Create class Car here
class Car(var brandName:String,var color:String,var ingineNum:Int){
    
    fun accelerate(){
        println("Increse speed of $brandName if road is clean")
    }
    fun applyBreak(){
        println("apply break and decrease accelerator if detect object as a front of $brandName car before 20 meter")
    }
}

fun main(){
    
    // Create objects here
    val car1=Car("Totoya","Red",1913)
    val car2=Car("B M W","Black",1239)
    car1.accelerate()
    car2.applyBreak()
    var car3=Car("Mercedes","Blue",1298)
    car3.accelerate()
    car3.applyBreak()
}
