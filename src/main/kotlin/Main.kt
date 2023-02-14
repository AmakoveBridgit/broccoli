fun main() {
    println("hello world")
    var name=" brigit"
    println(name)
    var age="30"
    println(age)
    addition()
    division()
    addition(20 ,30)
    multiply(30 ,20)

}
fun addition(){
    var a=30
    var b=5
    var sum=a + b
    println(sum)
}
fun division(){
    var a=30
    var b=10
    var result=a + b
    println(result)
}
fun addition(numb1: Int ,numb2: Int){
    var addition= numb1 +numb2
    println(addition)
}
fun multiply(numb1: Int ,numb2: Int){
    var multiply=numb1 * numb2
    println(multiply)

}