@groovy.transform.ToString
class Book {
    String title
    List<Section> sections = []
}

@groovy.transform.ToString
class Section {
    String title
    List<Chapter> chapters = []
}

@groovy.transform.ToString
class Chapter {
    String title
    String text
}


//To do something similar in java we would probably need to create a lot of objects and perform sets or use a builder patter
//In this way with groovy ObjectGraphBuilder I feel like it is clean and with less boilerplate 
ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(title: "Book 1"){
    section(title: "Section 1"){
        chapter(title: "chapter 1")
        chapter(title: "chapter 2")
    }
    section(title: "Section 2"){
        chapter(title: "chapter 3")
        chapter(title: "chapter 4")    
    }
}

println book
