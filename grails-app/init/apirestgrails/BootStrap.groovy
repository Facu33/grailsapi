package apirestgrails

import grails.converters.JSON

import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
        marshaller()
    }

    def destroy = {
    }

    private void marshaller() {
        JSON.registerObjectMarshaller(Brand) {
            brand -> [
                    id : brand.id,
                    name : brand.name,
                    items: brand.items.collect {
                        item -> [
                                id:item.id,
                                name:item.name,
                        ]
                    },
            ]
        }

        JSON.registerObjectMarshaller(Item) {
            item -> [
                    id:item.id,
                    name:item.name,
                    total_items_in_this_category:item.total_items_in_this_category,
                    picture:item.picture,
                    children_categories:[]
            ]
        }
    }
}
