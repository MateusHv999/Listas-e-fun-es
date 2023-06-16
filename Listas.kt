
/*
fun main() {
 val lista = (0..99).toList() -- converto os numeros de 0 a 99 e transformo em uma lista
 val filtro = lista.filter{it % 2 == 0} -- filtro os números pares
 println(filtro) -- retorna os numeros pares
}*/

fun main (){
    val nomes = listOf("Jose", "Maria", "João", "Lucas") // Crio a lista com as strings
    nomes.map{ // uso o map para concatatenar o texto e criar uma nova lista. Essa lista agora é "Olá José, Olá Maria..")
        "Olá $it"
    }
        .forEach{
        println(it) // uso o for each para imprimir os argumentos.
    }
}