package br.com.digital_house.desafio_1

import java.util.*

class DigitalHouseManager () {

    var listaDeAlunosDH = mutableSetOf<Aluno>()
    var listaDeProfessoresDH = mutableSetOf<Professor>()
    var listaDeCursosDH = mutableSetOf<Curso>()
    var listaDeMatriculasDH = mutableSetOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        var curso = Curso(nome,codigoCurso, quantidadeMaximaDeAlunos)
        listaDeCursosDH.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCursosDH.forEach{if (it.codigoCurso == codigoCurso) {listaDeCursosDH.remove(it)} }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        listaDeProfessoresDH.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        var professorTitular = ProfessorTitular (nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfessoresDH.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaDeProfessoresDH.forEach{if (it.codigoProfessor == codigoProfessor) {listaDeProfessoresDH.remove(it)} }
    }

    fun matricularAluno (nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno (nome, sobrenome,codigoAluno)
        listaDeAlunosDH.add(aluno)
    }

    fun matricularAluno (codigoAluno: Int, codigoCurso: Int) {
        lateinit var cursoMatricula : Curso
        lateinit var alunoMatricula: Aluno
        listaDeCursosDH.forEach{if (it.codigoCurso == codigoCurso) {cursoMatricula = it} }
        listaDeAlunosDH.forEach{if (it.codigoAluno == codigoAluno) {alunoMatricula = it} }
        var controle = cursoMatricula.adicionarUmAluno(alunoMatricula)

        if (controle == true) {
            var matricula = Matricula(alunoMatricula, cursoMatricula)}
           /* println("A matrícula do(a) aluno(a) ${alunoMatricula.nome} ${alunoMatricula.sobrenome} no curso ${cursoMatricula.nome} foi realizada com sucesso")}
        else { println("Não foi possível realizar a matrícula. Verifique o código do curso e o código do aluno.")}*/
    }

    fun alocarProfessores (codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        lateinit var curso : Curso
        lateinit var professorAdjunto : ProfessorAdjunto
        lateinit var professorTitular : ProfessorTitular
        listaDeCursosDH.forEach{if (it.codigoCurso == codigoCurso) {curso = it} }
        listaDeProfessoresDH.forEach{if (it.codigoProfessor == codigoProfessorAdjunto) { professorAdjunto = it as ProfessorAdjunto}}
        listaDeProfessoresDH.forEach{if (it.codigoProfessor == codigoProfessorTitular) { professorTitular = it as ProfessorTitular}}
        curso.professorAdjunto = professorAdjunto
        curso.professorTitular = professorTitular

        }

}


