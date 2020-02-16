package org.jteam.algorithms.median

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MedianTest {

    @Test
    fun `findMedian should return median of three numbers`() {
        val median = findMedian(54, 13, 44)
        assertEquals(44,  median)
    }

    @Test
    fun `findMedian all values are equals`() {
        val median = findMedian(4, 4, 4)
        assertEquals(4, median)
    }

}