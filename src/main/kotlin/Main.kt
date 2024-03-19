fun main (){
 greeting("Hello","World")
  word("Akirachix")
    text("Come")
    fullName("Dorcas","Tuukuo")
    txt("codeHive")
    workout(10,30)
    area(20,40)
    convert(29.5)
    details("Dorcas Tuukuo",20,"Blue")
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
//write a program that prompts the user to enter two numbers and prints their sum,difference,product and quotient
fun workout(num1:Int,num2:Int){
    println(num1+num2)
    println(num1*num2)
    println(num2-num1)
    println(num2/num1)
}
//program that calculates the area of a rectangle, the user should be prompted to enter length and width of the rectangle
fun area(length:Int,width:Int){
    var calculation=length * width
    println(calculation)
}
//write a program that converts the temperature from Celsius to Fahrenheit
fun convert(degreesInCelsius:Double){
    var degreesInFahrenheit=((degreesInCelsius*9.0/5) + 32)
    println("$degreesInFahrenheit F")
}
//write a program that prompts the user to enter their name,age,and favourite color and then prints out a message including all of that information
fun details(name:String,age:Int,colour:String){
    var message="my name is $name and I am $age years old and my favourite colour is $colour"
    println(message)
}


