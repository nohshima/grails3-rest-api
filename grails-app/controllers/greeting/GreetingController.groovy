package greeting

import grails.rest.RestfulController
import com.github.rahulsom.swaggydoc.*
import com.wordnik.swagger.annotations.*
import grails.converters.JSON
import greeting.view.GreetingResponse

@Api(value = "geeting api", description = "get greeting api")
class GreetingController extends RestfulController {
    static responseFormats = ['json', 'xml']

    def greetingService
    
    GreetingController() {
        super(Greeting)
    }
    
    @Override @SwaggyList
    def index() {
        super.index()
    }
    
    @Override @SwaggyShow
    def show() {
        def greetingDelegate = greetingService.hello(params.id)
        render new GreetingResponse(id:greetingDelegate.greeting.id, message:greetingDelegate.hello()) as JSON
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
