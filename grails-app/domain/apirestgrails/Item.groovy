package apirestgrails
import grails.rest.Resource

@Resource(uri = '/items')
class Item {

    String name
    int total_items_in_this_category
    String picture

    static belongsTo = [brand: Brand]

    static constraints = {
        name blank: false, nullable: false
    }
}
