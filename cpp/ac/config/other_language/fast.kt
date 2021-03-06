import java.io.IOException
import java.io.InputStream
import java.lang.NumberFormatException
import java.lang.StringBuilder
import java.util.*
import kotlin.NoSuchElementException


fun main(){
	val sc = FastScanner(System.`in`)
	
	


}




class FastScanner(private val stream: InputStream) {
    
	private val buffer = ByteArray(1024)
    private var ptr = 0
    private var buflen = 0

    private fun hasNextByte(): Boolean {
        if (ptr < buflen) {
            return true
        } else {
            ptr = 0
            try {
                buflen = stream.read(buffer)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            if (buflen <= 0) {
                return false
            }
        }
        return true
    }

    private fun readByte() =
            if (hasNextByte()) buffer[ptr++]
            else -1

    private fun isPrintableChar(c: Byte) = c in 33..126

    fun hasNext(): Boolean {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++
        return hasNextByte()
    }

    fun next(): String {
        if (!hasNext()) throw NoSuchElementException()
        val sb = StringBuilder()
        var b = readByte()
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b.toInt())
            b = readByte()
        }
        return sb.toString()
    }

    fun nextLong(): Long {
        if (!hasNext()) throw NoSuchElementException()
        var n = 0L
        var minus = false
        var b = readByte()
        if (b.toInt() == '-'.code) {
            minus = true
            b = readByte()
        }
        if (b !in '0'.code..'9'.code)
            throw NumberFormatException()
        while (true) {
            if (b in '0'.code..'9'.code) {
                n *= 10
                n += b - '0'.code
            } else if (!isPrintableChar(b)) {
                return if (minus) -n else n
            } else {
                throw NumberFormatException()
            }
            b = readByte()
        }
    }

    fun nextInt(): Int {
        val n1 = nextLong()
        if (n1 !in Int.MIN_VALUE..Int.MAX_VALUE)
            throw NumberFormatException()
        return n1.toInt()
    }

    fun NextDouble() = next().toDouble()
}

