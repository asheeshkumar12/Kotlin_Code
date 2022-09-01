fun main() {
    
    // write your code here
    val list=listOf<Char>('+','-','*','/')
    var a=3
    var b=6
    for(i in 0..list.size-1){
        println(mathfun(list[i],a,b))
    }
    
}
fun mathfun(c:Char,a:Int,b:Int):Int{
  if(c=='+'){
      return a+b
  }
  else if(c=='-'){
      return a-b
  }
  else if(c=='*'){
      return a*b
  }
  else{
  return a/b
    
 }
}
