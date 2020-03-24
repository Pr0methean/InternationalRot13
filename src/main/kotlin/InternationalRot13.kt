import com.ibm.icu.text.Normalizer2
import java.io.InputStreamReader




val ROT13 = Array<Byte>(256) {
    i ->
    if (i >= 'A'.toInt() && i <= 'M'.toInt()) {
        (i + 13).toByte()
    } else if (i >= 'a'.toInt() && i <= 'm'.toInt()) {
        (i + 13).toByte()
    } else if (i >= 'N'.toInt() && i <= 'Z'.toInt()) {
        (i - 13).toByte()
    } else if (i >= 'n'.toInt() && i <= 'z'.toInt()) {
        (i - 13).toByte()
    } else {
        i.toByte()
    }
}

fun main() {
    val inNormalizer = Normalizer2.getInstance(
        InputStreamReader(System.`in`, "UTF-8"),
        "inNormalizer", Normalizer2.Mode.DECOMPOSE)
    for (Byte byte : inNormalizer.)
}