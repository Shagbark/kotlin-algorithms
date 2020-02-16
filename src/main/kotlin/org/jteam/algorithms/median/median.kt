package org.jteam.algorithms.median

fun findMedian(a: Int, b: Int, c: Int) : Int {
    return if (a in b..c || a in c..b)
        a
    else
        if (b in a..c || b in c..a) b else c
}