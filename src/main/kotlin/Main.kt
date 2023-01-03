fun nummayor(num1:Int, num2: Int, num3: Int): Int{
    if(num1 >= num2 && num1 >= num3){
        return num1
    }else {
        if(num2 >= num1 && num2 >= num3){
            return num2
        }else{
            return num3
        }
    }

}
fun nummenor(num1:Int, num2: Int, num3: Int): Int{
    if(num1 <= num2 && num1 <= num3){
        return num1
    }else {
        if(num2 <= num1 && num2 <= num3){
            return num2
        }else{
            return num3
        }
    }

}

fun main(args: Array<String>) {
    var num1 = 5
    var num2 = 5
    var num3 = 5

    var nmayor = nummayor(num1,num2,num3)
    var nmenor = nummenor(num1,num2,num3)


    println("NUMEROS >>> Numero1 =" +num1+ " >>> Numero2 ="+num2+" >>> Numero3 ="+num3+"")
    if (num1 == num2 && num2==num3){
        println("TODOS LOS NUMEROS SON IGUALES!!!")
    }else {
        println("El numero mayor es: " + nmayor)
        println("El numero menor es: " + nmenor)
    }
}