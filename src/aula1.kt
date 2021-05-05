fun main() {
    /*println("teste");

    //val - imutável
    //var - mutável
    val inteiro: Int = 1
    val numeroGrande: Long = 832838283283
    val text: String = "Exemplo"
    val valor: Double = 10.10
    val testeVerdade: Boolean = true
    val decimal: Float = 10.1F
    var n: Int = 2
    n++

    //Comparadores & Operadores
    println(2+2)
    println(2-2)
    println(10/2)
    println(100*20)
    println(634%2)
    println(120!=48384)
    println("Hello" == "hello")
    println(3/2.0)
    println(n)

    //Tabela Verdade
    println(2 == 2)*/

    /*
    //Listas imutáveis
    val pets = listOf<String>("cachorro", "gato", "papagaio", "peixe")
    println(pets.count())
    println(pets.first())
    println(pets.last())
    println(pets[2])

    //Lista mutáveis
    val petsMutaveis = mutableListOf<String>("cachorro", "gato", "papagaio", "peixe", "coruja")
    petsMutaveis.add("golfinho")

    println(petsMutaveis)
     */

    /*
    val aleatorio: Int = (0..40).random()
    println(aleatorio)
    when {
        aleatorio <= 18.5 -> println("Muito magro")
        aleatorio <= 24.9 -> println("Peso normal")
        aleatorio <= 29.9 -> println("Sobrepeso")
        else -> println("Obesidade")
    }
     */

    /*
    for(num in 1..10 step 4) {
        println(num)
    }
     */

    /*
    val forList = mutableListOf<String>("cachorro", "gato", "papagaio", "peixe", "coruja")

    for(item in forList) {
        println(item)
    }

    forList.forEach { pet ->
        println(pet)
    }

    forList.forEach {
        println(it)
    }
     */

//    var x: Int = 0
//    while(x < 2) {
//        println(x)
//        x++
//    }

//    val nome = meuNomeCompleto("Paulo", "Horacio")
//    val soma = soma(1,2)
//    println(nome)
//    println(soma)

//    println(maiorNumero(100,47,60))
//    println(compararTextos("Teste","Tewxto"))
//    println(ePar(3432))
    imprimeCemImparInteiros()
}

fun meuNomeCompleto(nome: String, sobrenome: String): String {
    return "$nome $sobrenome"
}

fun soma(numA: Int, numB: Int): Int {
    return numA + numB
}

fun maiorNumero(numA: Int, numB: Int, numC: Int): Int? {
    val listNumber: List<Int> = listOf(numA, numB, numC)
    return listNumber.maxOrNull()
}

fun compararTextos(textoA: String, textoB: String): Boolean {
    return textoA == textoB
}

fun ePar(num: Int): Boolean {
    return num % 2 == 0
}

fun imprimeCemImparInteiros() {
    var numbersPrinted = 0
    var iterador = 1

    while(numbersPrinted !== 100) {
        if(iterador % 2 != 0 ) {
            println(iterador)
            numbersPrinted++
        }
        iterador++
    }
}