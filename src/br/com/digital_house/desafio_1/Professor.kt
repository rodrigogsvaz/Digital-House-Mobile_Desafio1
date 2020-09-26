package br.com.digital_house.desafio_1

class Professor (
        val nome: String,
        val sobrenome: String,
        var tempoDeCasa: Int,
        var codProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Professor && this.codProfessor == other.codProfessor)
    }

}