
import java.util.*

class AutoGenerate {
    fun generate_order_id(): String {
        val chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray()
        val r = Random(Date().time)
        val id = CharArray(5)
        for (i in 0..4) {
            id[i] = chars[r.nextInt(chars.size)]
        }
        return String(id)
    }
}