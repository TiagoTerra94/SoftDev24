package com.example.mysecondapp.views

//Crie uma aplicação que apresente uma lista de alunos.
//Considere que:
//Cada aluno possui um nome, morada e email.
//A lista de alunos deve apresentar apenas o nome do aluno.
//Quando clicado num elemento deve ser redirecionado para uma nova Activity onde são
//apresentados os dados do aluno clicado
class Alunos(val nome:String, val morada: String, val email:String) {

    override fun toString(): String {
        return "$nome"
    }
}