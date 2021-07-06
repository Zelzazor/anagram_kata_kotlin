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
    }

    

    
}