package br.com.digital_house.desafio_1

class Curso (
        val nome: String,
        val codCurso: Int,
        professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto,
        var quantidadeMaximaDeAlunos: Int) {

    var listaDeAlunos = mutableSetOf<Int>()

    fun incluirAlunos(vararg codAluno: Int) {
        var quantidadeDeAlunosParaCadastro = mutableSetOf<Int>()
        codAluno.forEach { quantidadeDeAlunosParaCadastro.add(it) }

        if (listaDeAlunos.size + quantidadeDeAlunosParaCadastro.size <= quantidadeMaximaDeAlunos) {
            quantidadeDeAlunosParaCadastro.forEach{listaDeAlunos.add(it)}
        } else {
            println("O número máximo de alunos nesse curso é de ${quantidadeMaximaDeAlunos}. \n Por favor, reintroduza um número de alunos menor ou igual ao número máximo informado.")
        }
}

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codCurso == other.codCurso)

    }
}

