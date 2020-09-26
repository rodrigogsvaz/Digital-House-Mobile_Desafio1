package br.com.digital_house.desafio_1

class Curso (
        val nome: String,
        val codCurso: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codCurso == other.codCurso)

    }

}