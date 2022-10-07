class RingBuffer<Element> (val size: Int) {
    private var elements = arrayOfNulls<Any>(size)
    private var read_point = 0
    private var write_point = 0
    var count: Int = 0
        private set

    fun first(): Element? {
        if (count > 0)
            return elements.get(read_point) as Element
        return null
    }

    fun write(element: Element): Boolean {
        if (count >= size)
            return false
        elements.set(write_point, element)
        count += 1
        write_point = if (write_point + 1 >= size) 0 else write_point + 1
        return true
    }

    fun read(): Element? {
        if (count <= 0)
            return null
        var ret: Element = elements.get(read_point) as Element
        read_point = if (read_point + 1 >= size) 0 else read_point + 1
        count -= 1
        return ret
    }

    override fun toString(): String {
        var ret = "["
        var tmp_read_point = read_point
        var tmp_count = count
        while (tmp_count > 0) {
            ret += " ${elements.get(tmp_read_point)}"
            tmp_read_point += 1
            if (tmp_read_point >= size)
                tmp_read_point = 0
            tmp_count -= 1
        }
        ret += " ]"
        return ret
    }
}