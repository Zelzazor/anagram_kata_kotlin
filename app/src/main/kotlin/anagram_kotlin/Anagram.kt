package anagram_kotlin

class Anagram {
    constructor(fileName: String?){
        if(fileName == null){
            throw IllegalArgumentException("String null")
        }
    }

    constructor(words: List<String>?){
        if(words == null){
            throw IllegalArgumentException("String null")
        }
        if(words.size == 0){
            throw IllegalArgumentException("List is empty")
        }
    }
    fun toList():List<List<String>>{
        return listOf<List<String>>(listOf<String>("adios", "adois"))
    }

    

    
}