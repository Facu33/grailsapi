package apirestgrails

import grails.rest.RestfulController

class ItemController extends RestfulController<Item> {

    static responseFormats = ['json']

    ItemController() {
        super(Item)
    }

    @Override
    def index() {
        def brandId = params.brandId
        if (brandId != null) {
            respond Item.where {
                brand.id == brandId
            }.list()
        } else {
            respond Item.list()
        }
    }
}
