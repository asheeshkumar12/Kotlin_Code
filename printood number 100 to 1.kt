fun main() {
    
    // write your code here
    for(i in 99 downTo 1 step 2){
        println(i)
    }
    var i=100
    while(i>=1){
        if(i%2==1){
            println(i)
        }
        i--
    }
    i=100
    do{
        if(i%2==1){
            println(i)
        }
        i--
    }while(i>=1)
    
}
