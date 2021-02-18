import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitNullAttributes = true

builder.sports {
    sport(id:1){
        name 'Baseball'
    }
    sport(id:2){
        name 'Football'
    }
    sport(id:null){
        name ''
    }    
}
