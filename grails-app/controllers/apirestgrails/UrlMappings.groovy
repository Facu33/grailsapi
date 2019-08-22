package apirestgrails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/brands"(resources:"brand"){
            "/items"(resources: "item")
        }

        "/items"(resources:"item" )

        "/brands"(resources: "brand")


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
