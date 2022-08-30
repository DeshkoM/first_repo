package ua.deshko.first_project

import segmentation
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import difference
import exponentiate
import factorial
import summ
import triangle

class MathKtTest {

    @Test
    fun `Test1,1 1+1 = 2 ` (){
        val dannie = summ(1,1)
        assertEquals(2,dannie)
    }
    @Test
    fun `Test1,2 333 + 333 = 666` (){
        val dannie = summ(333,333)
        assertEquals(666,dannie)
    }
    @Test
    fun `Test2,1 2 - 1 = 1 ` (){
        val dannie = difference(2,1)
        assertEquals(1, dannie)
    }
    @Test
    fun `Test2,2 785 - 234 = 551`(){
        val dannie = difference(785,234)
        assertEquals(551, dannie)
    }
    @Test
    fun `Test3,1 1 delim na  2 = 0,5` (){
        val dannie = segmentation(1F,2F)
        assertEquals(0.5F, dannie)
    }
    @Test
    fun `Test3,2 8375 delim na 33,5 = 250`(){
        val dannie = segmentation(8375F,33.5F)
        assertEquals(250.0F,dannie)
    }
    @Test
    fun `Test4,1 2 v stepeni 10 = 1024`(){
        val dannie = exponentiate(2,10)
        assertEquals(1024,dannie)
    }
    @Test
    fun `Test 4,2 12 v stepeni 5 = 248832` () {
        val dannie = exponentiate(12,5)
        assertEquals(248832,dannie)
    }
    @Test
    fun `Test 5,1 6! = 720`(){
        val dannie = factorial(6)
        assertEquals(720, dannie)
    }
    @Test
    fun `Test 5,2 10! = 3628800`(){
        val dannie = factorial(10)
        assertEquals(3628800,dannie)
    }
    @Test
    fun `Test 6,1 a= 2, b=3 = Ne ravnostoronniy`(){
        val dannie = triangle(2,3)
        assertFalse(dannie)
    }
    @Test
    fun `Test 6,2 a= 5, b=5 = Ravnostoronniy` (){
        val dannie = triangle(5,5)
        assertTrue(dannie)
    }
}

