class Aposentadoria(val idade: Int, val sexo: String, val anosDeContribuicao: Int) {
    fun elegivelParaAposentar(): Boolean {
        if(sexo !== "feminino" && sexo !== "masculino") {
            println("Sexo $sexo é inválido, deve ser: feminino ou masculino")
            return false
        }
        if(sexo == "feminino" && idade == 60 && anosDeContribuicao >= 30) return true
        else if(sexo == "masculino" && idade == 65 && anosDeContribuicao >= 30) return true
        return false
    }
}