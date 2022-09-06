package ua.deshko.first_project

import segmentation
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import difference
import exponentiate
import factorial
import isTriangle
//import isTriangleRectangular
import chooseMax
import chooseMin
import isTriangleRectangular
import maxOfThree
import middleOfThree
import minOfTrhree
import summ


class MathKtTest {

    @Test
    fun `Test1 1+1 = 2 `() {
        val dannie = summ(1, 1)
        assertEquals(2, dannie)
    }

    @Test
    fun `Test2 333 + 333 = 666`() {
        val dannie = summ(333, 333)
        assertEquals(666, dannie)
    }

    @Test
    fun `Test3 2 - 1 = 1 `() {
        val dannie = difference(2, 1)
        assertEquals(1, dannie)
    }

    @Test
    fun `Test4 785 - 234 = 551`() {
        val dannie = difference(785, 234)
        assertEquals(551, dannie)
    }

    @Test
    fun `Test5 1 delim na  2 = 0,5`() {
        val dannie = segmentation(1, 2)
        assertEquals(0.5F, dannie)
    }

    @Test
    fun `Test6 25 delim na 0 = 0,0`() {
        val dannie = segmentation(25, 0)
        assertSame(0,dannie)
    }

    @Test
    fun `Test7 20 delim na -10 = -2`() {
        val dannie = segmentation(20, -10)
        assertEquals(-2F, dannie)
    }

    @Test
    fun `Test8 2 v stepeni 10 = 1024`() {
        val dannie = exponentiate(2, 10)
        assertEquals(1024, dannie)
    }

    @Test
    fun `Test9 2 v stepeni -1 = 0,5`() {
        val dannie = exponentiate(2, -1)
        assertEquals(0.5, dannie)
    }

    @Test
    fun `Test10 100 v stepeni 0 = 1`() {
        var dannie = exponentiate(100, 0)
        assertEquals(1, dannie)
    }

    @Test
    fun `Test11 6! = 720`() {
        val dannie = factorial(6)
        assertEquals(720, dannie)
    }

    @Test
    fun `Test12 10! = 3628800`() {
        val dannie = factorial(10)
        assertEquals(3628800, dannie)
    }
    @Test
    fun `Test12,2 0! = 0`() {
        val dannie = factorial(0)
        assertEquals(0, dannie)
    }
    @Test
    fun `Test13 Triangle is exist`(){
        var dannie = isTriangle(4,4,5)
        assertTrue(dannie)
    }
    @Test
    fun `Test14 Triangle is not exist`(){
        var dannie = isTriangle(10,4,5)
        assertFalse(dannie)
    }
    @Test
    fun `Test15 Choose max of three int a=3,b=4,c=5   max 5`(){
        var dannie = maxOfThree(3,4,5)
        assertEquals(5,dannie)
    }
    @Test
    fun `Test16 Choose min of three int a=3,b=4,c=5   min 3`(){
        val dannie = minOfTrhree(3,4,5)
        assertEquals(3,dannie)
    }
    @Test
    fun `Test17 Choose middle of three int a=3,b=4,c=5   middle 4`() {
        val dannie = middleOfThree(3, 4, 5)
        assertEquals(4,dannie)
    }
    @Test
    fun `Test18 rectangular triangle a=3, b=4, c=5`(){
        val dannie = isTriangleRectangular(3,4,5)
        assertEquals("Треугольник существует, треугольник прямоугольный",dannie)
    }
    @Test
    fun `Test 19 choose max  2,25,55,78,93,101 = 101`(){
        val dannie = chooseMax(2,25,55,78,93,101)
        assertEquals(101,dannie)
    }
    @Test
    fun `Test 20 choose min  4,4,5,4,3 = 3`(){
        val arr_test = arrayOf(4,2,5,4,6)
        val dannie = chooseMin(arr_test)
        assertEquals(2,dannie)
    }
    /*@Test
    fun `Test18 equilateral triangle a=4,b=4,c=4  ` (){
        var dannie =choose_type_triangle(4,4,4)
        assertEquals("Треугольник существует, треугольник равносторонний",dannie)
    }
    @Test
    fun `Test20 scalene triangle a=3, b=5, c=6`(){
        var dannie = choose_type_triangle(6,5,3)
        assertEquals("Треугольник существует, треугольник разносторонний",dannie)
    }*/

}




