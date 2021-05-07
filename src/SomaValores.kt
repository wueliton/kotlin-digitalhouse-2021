class SomaValores(val valores: List<Int>) {
    fun somaValores() {
        println(valores.reduce { acc, i ->  acc * i })
    }
}