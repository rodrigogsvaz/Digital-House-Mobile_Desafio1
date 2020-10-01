package br.com.digital_house.desafio_1

class Curso (
        val nome: String,
        val codigoCurso: Int,
        var quantidadeMaximaDeAlunos: Int) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    var listaDeAlunosCurso = mutableSetOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno) :Boolean {
        if(listaDeAlunosCurso.size < quantidadeMaximaDeAlunos) {
            listaDeAlunosCurso.add(umAluno)
            println("O(a) aluno(a) ${umAluno.nome} ${umAluno.sobrenome} foi inserido no curso com sucesso.")
            return true
        } else {
            println("As ${quantidadeMaximaDeAlunos} vagas deste curso já encontram-se preenchidas. \n Não é possível realizar a inclusão do(a) ${umAluno.nome} ${umAluno.sobrenome} neste momento.")
            return false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaDeAlunosCurso.remove(umAluno)
        println("O(a) aluno(a) ${umAluno.nome} ${umAluno.sobrenome} foi removido(a) do curso com sucesso.")
    }

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigoCurso == other.codigoCurso)

    }
}

