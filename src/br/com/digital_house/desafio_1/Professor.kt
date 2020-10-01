package br.com.digital_house.desafio_1

abstract class Professor (
        val nome: String,
        val sobrenome: String,
        var tempoDeCasa: Int,
        var codigoProfessor: Int) {



    override fun equals(other: Any?): Boolean {
        return (other is Professor && this.codigoProfessor == other.codigoProfessor)
    }

}