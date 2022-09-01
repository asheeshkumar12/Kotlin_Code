fun main(){
    
    val arr=arrayOf<Int>(0,100,200,300,400,500)
    try{
        print(arr[6])
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println("index 6 is not print in the array")
    }
    print(arr[5])
}
