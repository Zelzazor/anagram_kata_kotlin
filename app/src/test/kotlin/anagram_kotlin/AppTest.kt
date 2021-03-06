/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package anagram_kotlin

import org.junit.Test
import org.junit.Assert

class AppTest {
    @Test fun whenStringInputIsNullThrowException() {
        Assert.assertThrows(IllegalArgumentException::class.java){
            var str: String? = null; 
            var test = Anagram(str); 
        }
    }

    @Test fun whenListInputIsNullThrowException() {
        Assert.assertThrows(IllegalArgumentException::class.java){
            var lst: List<String>? = null; 
            var test = Anagram(lst); 
        }
    }
    @Test fun ListHasNoElementsThrowException(){
        Assert.assertThrows(IllegalArgumentException::class.java){
            var list : List<String>? = listOf<String>()
            var test = Anagram(list)
        }
    }
    @Test fun ListHasElementsThrowException(){
        var list : List<String>? = listOf<String>("hola", "adios", "adois")
        var test = Anagram(list)
        var actualResult = test.toList()
        var expectedResult = listOf<List<String>>(listOf<String>("adios", "adois"))
        Assert.assertEquals(expectedResult, actualResult)
    }
}
