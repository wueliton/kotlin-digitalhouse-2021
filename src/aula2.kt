// fun main é o entrypoint de cada arquivo

class Animal (
    val nome: String,
    val tipo: String
) {
    var reino: String =  ""
    constructor(nome: String,tipo: String,reino: String) : this(nome, tipo) {
        this.reino = reino
    }

    init {

    }

    fun comer() {
        println("Animal $nome está comendo, reino $reino")
    }
}

fun main() {
    val gato = Animal("gato", "felino")
    gato.comer()

    val cachorro = Animal("teddy", "cachorro", "mamifero")
    cachorro.comer()
}