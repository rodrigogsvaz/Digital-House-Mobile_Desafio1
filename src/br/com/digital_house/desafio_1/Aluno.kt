package br.com.digital_house.desafio_1

class Aluno (
        val nome: String,
        val sobrenome: String,
        val codAluno: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && this.codAluno == other.codAluno)
    }

}