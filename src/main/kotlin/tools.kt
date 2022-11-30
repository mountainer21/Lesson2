package ex

import kotlin.random.Random

fun initIntList(): MutableList<Int>{
    val result = mutableListOf<Int>()
    for (i in 0..10){
        result.add(Random.nextInt(-200, 200))
    }
    return result
}