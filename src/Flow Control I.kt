fun main() {
    oddNumbers()
    robot(28)
    robot(4)
    robot(13)
    println(words(arrayOf("Jeannine","Uwase","Marie")))
    fizzBuzz()

}
fun oddNumbers(){
    for(number in 1..100){
        if (number%2!=0){
            println(number)
        }
    }
}
fun words(names:Array<String>):Int {
    var counter=0
    for (names in names) {
        if (names.length > 5) {
            counter++
        }
    }
    return counter
}
fun robot(age:Int){
    if (age<6){
        println("Take a glass of milk")
    }
    else if(age>6 && age<=15){
        println("Take a bottle of fanta orange.")
    }
    else{
        println("Take a bottle of coca cola")
    }
}
fun fizzBuzz(){
    for(num in 1..100){
        if(num%5==0){
            println("Buzz")

        }
        else if (num%3==0){
            println("Fizz")
        }
        else if(num%3==0 && num%5==0) {
            println("FizzBuzz")
        }
        else{
            println(num)
        }
    }
}





