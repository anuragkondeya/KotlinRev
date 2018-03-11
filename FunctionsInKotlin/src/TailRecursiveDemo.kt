import java.math.BigInteger

fun fibWithoutTailRec(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fibWithoutTailRec(n - 1, a + b, a)
}

/**
 * This wont trigger a stack overflow
 */
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}