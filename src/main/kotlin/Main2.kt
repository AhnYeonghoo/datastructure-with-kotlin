import java.util.*;

class CollectionItem(
    val value: Int = Random().nextInt(1000),
    val name: String = UUID.randomUUID().toString()
) {
    override fun toString(): String {
        return "value = $value, name = $name"
    }
}

fun main() {
    val list = mutableListOf<CollectionItem>().apply {
        for (i in 0 until 1000) {
            add(CollectionItem())
        }
    }
    val mapped: List<String> = list.map { it.name }
    println(mapped.subList(0, 2))
    println(list.subList(0,2))
    
    val reduced: Int = list
    .map{ it.value }
    .reduce { acc, value -> acc + value }
    println(reduced)
}