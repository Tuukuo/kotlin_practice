fun main (){
 greeting("Hello","World")
  word("Akirachix")
    text("Come")
    fullName("Dorcas","Tuukuo")
    txt("codeHive")
}

fun greeting(x:String,y:String){
  var x="Hello"
  var y="World"
  var sentence=x + " " +y
  println(sentence)
  var statement= " I said $x in the $y"
    println(statement)
    if(x==y)
        println(true)
    else{
        println(false)
        println(x.uppercase())
        println(statement.replace("said","heard"))
    }
}
fun word(name:String){
  println(name[0])
  println(name.indexOf("k"))
}
fun text(word:String){
    var word= "  Come "
    println(word.trimStart())
    println(word.trimEnd())
    println(word.trim())
    println(word.startsWith("e"))
    println(word.endsWith(" "))
    println(word.length)

}
fun fullName(firstName:String,lastName:String){
    var details= firstName + lastName
    println(details)
}
fun txt(name:String){
    println(name.substring(2..5))
    println(name.slice(2..5))
}

