// Função que recebe dois números inteiros e retorna o resultado da soma

/*fun main(){
    var total = soma(1,2) -- retorna 3
}*/

/*fun soma(num1:Int, num2: Int){ -- Args de valor Int que retorna uma soma
    return println(num1 + num2);
}*/

// Função compacta que recebe dois números Int e retorna a multiplicação entre eles

/*fun main(){
    fun multiplicacao(num1 : Int, num2:Int) = println(num1*num2) -- declaramos nossos args como Int e colocamos nossa formula
    multiplicacao(2,3)
}*/

// Função calculadora

/*fun main(){
    calculadora(5, 2,::multiplicacao) -- retorna 10
    calculadora(5, 2,::soma) -- retorna 7
}
fun soma(num1:Int, num2: Int){
    return println(num1 + num2);
}
fun multiplicacao(num1 : Int, num2:Int) = println(num1*num2) -- nossa função que vai ser usada como arg e como formula pela função calculadora

fun calculadora(num1: Int, num2: Int, formula: (Int, Int)->Unit){ -- nossa função que vai receber uma função de parametro para o calculo
    formula(num1,num2)
}*/