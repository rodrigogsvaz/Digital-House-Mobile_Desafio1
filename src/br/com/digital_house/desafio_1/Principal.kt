package br.com.digital_house.desafio_1


fun main () {

    var digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Carlos", "Adão", 111, "Kotlin")
    digitalHouseManager.registrarProfessorTitular("Vitoria", "Gonçalves", 112, "Java")

    digitalHouseManager.registrarProfessorAdjunto("João", "Camargo", 211, 10)
    digitalHouseManager.registrarProfessorAdjunto("Wagner", "Consani", 212, 5)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 111, 211)
    digitalHouseManager.alocarProfessores(20002, 112, 212)

    digitalHouseManager.matricularAluno("Rodrigo", "Vaz", 301)
    digitalHouseManager.matricularAluno("Maria", "da Silva", 302)
    digitalHouseManager.matricularAluno("Bernardo", "Machado", 303)

    digitalHouseManager.matricularAluno(301, 20001)
    digitalHouseManager.matricularAluno(302, 20001)

    digitalHouseManager.matricularAluno(301, 20002)
    digitalHouseManager.matricularAluno(302, 20002)
    digitalHouseManager.matricularAluno(303, 20002)



}