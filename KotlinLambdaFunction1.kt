fun main() {
    
    val lowerCase  = {
        
        val lowerList = listOf("kare", "bloom", "spooler")
        
        val upperList = mutableListOf<String>()
        
        for(word in lowerList){
            upperList.add(word.uppercase())
        }
      upperList
    }
    
    val upperCase = lowerCase()
    
    println(upperCase)
}
