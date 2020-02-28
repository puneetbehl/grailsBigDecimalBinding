package example

import grails.validation.Validateable

class BookCo implements Validateable {
    String title
    String author
    Date releaseDate
    BigDecimal price
}
