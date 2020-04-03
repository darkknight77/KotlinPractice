import java.util.*

fun main(args: Array<String>) {

}
fun tut1(){
    var obj = Student();
    obj.name = "Bucky";
    println("${obj.name}");
    println("${obj.birthDate}")
}

fun tut2(){
    var num1 : Int = 7
    var num2 : Int = 10

    var result = num1 + num2;
    println("The addition of $num1 and $num2 = $result")
    println("The addition of $num1 and $num2 = $num1+num2") // wrong implementation
    println("The addition of $num1 and $num2 = ${num1+num2}") //right implementation
}

fun tut3(){
    var num1 : Int = 10
    var num2 : Int = 20
    var result : Int

    //if else as expression
    result = if(num1 > num2) num1
    else num2
    println("The biggest number among $num1 and $num2 is $result")

    //if else as expression
    result = getBiggestNum(num1,num2);

    println("The biggest number among $num1 and $num2 is $result")


}
fun getBiggestNum(num1:Int, num2:Int) : Int {
    return if (num1 > num2) num1
    else num2
}
fun add(num1:Int,num2:Int) : Int{
    return num1+num2;
}
// func within a line without using curly braces since it is a single line
fun add2(num1:Int, num2:Int) : Int  = num1+num2;

fun strComparison() {
    var str1: String = "Kotlin"
    var str2: String = "kotlin";

    if (str1.equals(str2, true)) println("Same")
    else println("Not Same")

    if (str1 == str2) println("Same")
    else println("Not Same")
}

fun nullHandling() {
    var str: String? = null;
    println(str?.length)

    var student: Student? = Student()
    student?.name = "John"
}

fun whenDemo() {
    var num: Int = 1
    var result: String

    //When as a switch
    when (num) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> "Shit happens"
    }

    //When as a fun expression
    result = when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "Shit happens"
    }
}
fun RangesDemo() {
    var nums = 1..5       //1 .. 5

    //enhanced for loop
    for (num in nums) println(num)
    //enhanced for loop with nums in reverse order
    for (num in nums.reversed()) println(num)


    var nums2 = 1..5       //1 .. 5

    //enhanced for loop where step is the value to jump/skip after every iteration
    for (num in nums2 step 2) println(num)


    //downTo method will reverse the order
    var nums3 = 1 downTo 15      //or (1).downTo(15)  since downTo is a method of Ranges class
    //enhanced for loop
    for (num in nums3) println(num)

    //until method will limit the value excluding the number in second param
    //In this case only nums from 1 to 14 will only be printed, excluding 15
    var nums4 = 1 until 15       //or (1).until(15)  since downTo is a method of Ranges class
    //enhanced for loop
    for (num in nums4) println(num)
}

fun list() {
    var nums = listOf(1, 2, 3, 4)
    for (num in nums) println(num)
    for ((i, e) in nums.withIndex()) println("The num $e is at index $i")

    var map = TreeMap<String, Int>();
    map["John"] = 34;
    map["Abruji"] = 44;

    for ((name, age) in map) println(" Name is $name and his age is $age")

}

