package greeting

import grails.rest.RestfulController
import com.github.rahulsom.swaggydoc.*
import com.wordnik.swagger.annotations.*
import grails.converters.JSON
import greeting.view.GreetingResponse

@Api(value = "挨拶API", description = "挨拶を返す")
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
    
    @Override
    @ApiOperation(value = "Show greetingResponse", response = GreetingResponse)
    @ApiResponses([
        @ApiResponse(code = 400, message = 'Bad Id provided'),
        @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    ])
    @ApiImplicitParams([
        @ApiImplicitParam(name = 'id', value = 'Id to fetch', paramType = 'path',
            dataType = 'int', required = true),
    ])
    def show() {
        def greetingDelegate = greetingService.hello(params.id)
        render new GreetingResponse(id:greetingDelegate.greeting.id, message:greetingDelegate.hello()) as JSON
    }
    
    @Override
    @ApiOperation(value = "Save greetingResponse", response = GreetingResponse)
    @ApiResponses([
        @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
        @ApiImplicitParam(name = 'body', paramType = 'body', required = true,
            dataType = 'GreetingResponse'),
    ])
    def save() {
        def greeting = super.save()
        def greetingDelegate = greetingService.hello(params.id)
        render new GreetingResponse(id:greetingDelegate.greeting.id, message:greetingDelegate.hello()) as JSON
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
