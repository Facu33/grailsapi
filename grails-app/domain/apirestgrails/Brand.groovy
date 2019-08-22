package apirestgrails

import grails.rest.Resource

@Resource(uri = '/brands')
class Brand {

    String name
    static hasMany = [items: Item]

    static constraints = {
        name blank: false, nullable: false
    }
}
