package greeting

import grails.rest.RestfulController
import com.github.rahulsom.swaggydoc.*
import com.wordnik.swagger.annotations.*

@Api(value = "geeting api", description = "get greeting api")
class GreetingController extends RestfulController<Greeting> {
    static responseFormats = ['json', 'xml']
    GreetingController() {
        super(Greeting)
    }
    
    @Override @SwaggyList
    def index() {
        super.index()
    }
    
    @Override @SwaggyShow
    def show() {
        super.show()
    }
    
    @Override @SwaggySave
    def save() {
        super.save()
    }
    
    @Override @SwaggyUpdate
    def update() {
        super.update()
    }
    
    @Override @SwaggyDelete
    def delete() {
        super.delete()
    }
    
    @Override @SwaggyPatch
    def patch() {
        super.patch()
    }
}
