package br.com.digital_house.desafio_1

import java.util.*

class Matricula (aluno: Aluno, curso: Curso, var data: Date) {

    val nome = aluno.nome
    val curso = curso.nome


    fun efetuarMatricula() {
        println("Matricula do(a) $nome no curso $curso realizada com sucesso em $data")
    }


}
