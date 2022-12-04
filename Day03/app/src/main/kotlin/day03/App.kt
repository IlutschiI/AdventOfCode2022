/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package day03

import kotlin.math.absoluteValue

fun main() {
    var input = object {}::class.java.getResource("/input").readText()


    var rucksacks = input
            .split("\n")
            .map {
                it.substring(0, it.length / 2) to it.substring(it.length / 2)
            }

    println(rucksacks)

    var priority = rucksacks.map { // find shared items
        it.first.filter { c: Char ->
            it.second.contains(c)
        }
    }
            .map {
                it.first()
            }
            .map {
                println(it)
                it
            }
            .map {
                var additionalValue = if (it.isUpperCase()) 27 else 1
                var a = (it.lowercaseChar().code-97) + additionalValue
                println("$it ($a)")
                a
            }
            .sum()

    println(priority)
}
