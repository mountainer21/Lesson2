package ex

fun main(args: Array<String>) {

    val list = initIntList()
    println("All numbers: $list")
    println()

    //11.36. Дан массив. Напечатать:
    //а) все неотрицательные элементы;
    //б) все элементы, не превышающие число 100.
    //11.37. Дан массив целых чисел. Напечатать:
    //а) все четные элементы;
    //б) все элементы, оканчивающиеся нулем.

    println("Все неотрицательные элементы: ${listPositiveItems(list)}")
    println()
    println("Все элементы, не превышающие число 100: ${listLess100(list)}")
    println()
    println("Все четные элементы: ${listEven(list)}")
    println()
    println("Все элементы, оканчивающиеся нулем: ${listEnding0(list)}")
    println()

    //11.17. Дан массив. Все его элементы:
    //а) увеличить в 2 раза;
    //б) уменьшить на число А;
    //в) разделить на первый элемент.

    println("увеличить в 2 раза:  ${listX2(list)}")
    println()
    println("уменьшить на число А  ${listDecreaseByNum(list, 5)}")
    println()
    println("разделить на первый элемент   ${listDivByFirst(list)}")
//    ${String.format("%.3f", listDivByFirst(list))}"
}



//11.36. Дан массив. Напечатать:
//а) все неотрицательные элементы;
fun listPositiveItems(list: MutableList<Int>): List<Int> {
    val subList = list.filter {
        it >= 0
    }
    return subList
}

//б) все элементы, не превышающие число 100.
fun listLess100(list: MutableList<Int>): List<Int> {
    val subList = list.filter {
        it <= 100 && it >= -100
    }
    return subList
}

//11.37. Дан массив целых чисел. Напечатать:
//а) все четные элементы;
fun listEven(list: MutableList<Int>): List<Int> {
    val subList = list.filter {
        it % 2 == 0
    }
    return subList
}

//б) все элементы, оканчивающиеся нулем.
fun listEnding0(list: MutableList<Int>): List<Int> {
    val subList = list.filter {
        it % 10 == 0
    }
    return subList
}

//11.17. Дан массив. Все его элементы:
//а) увеличить в 2 раза;
fun listX2(list: MutableList<Int>): List<Int> {
    val sublist = list.map {
        it * 2
    }
    return sublist
}

//б) уменьшить на число А;
fun listDecreaseByNum(list: MutableList<Int>, num: Int): List<Int> {
    val sublist = list.map {
        it - num
    }
    return sublist
}

//в) разделить на первый элемент.
fun listDivByFirst(list: MutableList<Int>): List<Double> {
    val sublist = list.map {
        it/list[0].toDouble()
    }
    return sublist
}
