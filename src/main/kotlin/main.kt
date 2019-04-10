fun main(args: Array<String>) {

    val cipherText = "BRVKLNR"

    (0..25).forEach {
        val result = decrypt(cipherText.toCharArray().toList(), key = it)
        println("key=$it,\t ${result.joinToString(separator = "")}")
    }

}


/// 暗号化
fun encrypt(list: List<Char>, key: Int): List<Char> {

    return list.map {
        val translated = it + key
        if (translated > 'Z') {
            (translated - 26)
        } else {
            translated
        }
    }
}


/// 復号化
fun decrypt(list: List<Char>, key: Int): List<Char> {
    return list.map {
        val translated = it - key
        if (translated < 'A') {
            (translated + 26)
        } else {
            translated
        }
    }
}