package ru.netology

fun main() {

    var likes = 631
    val designationPeople: String
    if (likes % 10 == 1 && likes % 100 != 11) {
        designationPeople = "человеку"
    } else designationPeople = "людям"
    println("Понравилось $likes $designationPeople")


}

