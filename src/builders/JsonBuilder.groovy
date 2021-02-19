import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {
    book {
        title 'The 4 hour work week'
        author {
            name 'Tinothy'
        }
    }
}

println builder.toPrettyString()

/*
{
    "books": {
        "book": {
            "title": "The 4 hour work week",
            "author": {
                "name": "Tinothy"
            }
        }
    }
}
*/
