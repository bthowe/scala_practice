def century(x: Int): Int = if (x % 100 == 0) x / 100 else (x / 100) + 1
century(1901)
century(1900)
century(1899)
