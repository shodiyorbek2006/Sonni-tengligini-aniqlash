import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    if(a!=b){
        println(a+b)
    }else{
        println(0)
    }
}