fun main() {
    var school = "akirachix"
    println(school[0])
    println(school[2])
    println(school[3])

    println(statement())

    println(length())

    var message1 = "Wendy"
    var message2 = "Thats me!"
    if (message1 ==(message2)){
        println("Thats me!")} else{
            println("I dont know who that is")
    }
}
fun statement():String{
    var name = "Jane"
    var age = "10"
    var statement = ("Hi my name is $name and I am $age years old")
    return statement
}

fun length():String{
    var length = "50"
    return length

}





