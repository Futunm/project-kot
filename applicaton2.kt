package com.example.myapplication22

import java.util.ArrayList

fun main() {
    val task1 = tasks(id = 1, name = "ftoon", note = "travel",iscomplete = false)
    val task2 = tasks (id = 2, name = "sadeem" ,"buy a cat",iscomplete = false)
    val task3 = tasks  (id = 3, name = "lulu" ,"stay at home",iscomplete = false)
    val todo = todo()
    todo.addtask(task1)
    todo.addtask(task2)
    todo.addtask(task3)
    todo.removetask(task3)
    todo.printtask(id = 1)
    todo.changeTask(task2)
    todo.showAllTasks()
}

data class tasks (val id:Int , val name :String, val note: String, var iscomplete : Boolean)
class todo {
    val tasks = arrayListOf<tasks>()

    fun showAllTasks() {
        for (task in tasks) {
            println("Name: ${task.name}, Task: ${task.note}")
        }
    }

    fun addtask(task:tasks) {
tasks.add(task)
        println("Task added: ${task.note}")
    }

    fun removetask(task:tasks) {
        tasks.remove(task)
        println("Task removed: ${task.note}")
    }
    fun printtask(id: Int) {
        for (task in tasks) {
            if (task.id == id) {
                println(task)
            }
        }
    }

    fun changeTask(task:tasks) {
        val index= tasks.indexOf(task)
        tasks [index].iscomplete = !tasks[index].iscomplete

    }
}
