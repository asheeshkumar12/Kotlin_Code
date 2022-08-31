fun main() {
    
    // write your code here
    var n1=0
    println(n1)
    var n2=1 
    var n3=0
    for(i in 2..10){
        n3=n1+n2;
        println(n3)
        n1=n2
        n2=n3;
    }
    
}
