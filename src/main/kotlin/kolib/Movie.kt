package kolib

class Movie {
    var id: Long? = null
    var movieName: String? = null
    var releaseYear: Int? = null
    var language: String? = null

    constructor() {}
    constructor(id: Long?, movieName: String?, releaseYear: Int?, language: String?) {
        this.id = id
        this.movieName = movieName
        this.releaseYear = releaseYear
        this.language = language
    }
}