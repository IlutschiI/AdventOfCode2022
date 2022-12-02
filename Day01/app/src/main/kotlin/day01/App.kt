/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package day01

fun main() {

    var input = object {}::class.java.getResource("/input").readText()

    var caloriesPerElves = input
            .split("\r\n\r\n")
            .filter { it.isNotBlank() }
            .map {
                it.split("\r\n")
                        .filter { it.isNotBlank() }
                        .sumOf { calorie ->
                            println(calorie)
                            calorie.trim().toInt()
                        }
            }.sortedDescending()

    var top3Calories = caloriesPerElves.take(3).sum()

    println("most calories: ${caloriesPerElves.first()}")
    println("calories of top 3: ${top3Calories}")

}