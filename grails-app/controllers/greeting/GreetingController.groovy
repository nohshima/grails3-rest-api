package greeting

import com.github.rahulsom.swaggydoc.SwaggyList
import grails.rest.RestfulController
import com.wordnik.swagger.annotations.*
import greeting.view.GreetingRequest
import greeting.view.GreetingResponse
import greeting.model.Greeting

@Api(value = "挨拶API", description = "挨拶を返す")
class GreetingController extends RestfulController {
    static responseFormats = ['json', 'xml']

    GreetingService greetingService
    GreetingRegisterService greetingRegisterService

    GreetingController() {
        super(GreetingRequest)
    }

    @ApiOperation(value = "Show greetingResponse", response = GreetingResponse)
    @ApiResponses([
        @ApiResponse(code = 400, message = 'Bad Id provided'),
        @ApiResponse(code = 404, message = 'Could not find Demo with that Id'),
    ])
    @ApiImplicitParams([
        @ApiImplicitParam(name = 'id', value = 'Id to fetch', paramType = 'path', dataType = 'int', required = true),
    ])
    def show() {
        def greeting = greetingService.hello(params.id)
        respond new GreetingResponse(id:greeting.id.value, message:greeting.hello())
    }
    
    @ApiOperation(value = "Save greeting", response = GreetingResponse)
    @ApiResponses([
        @ApiResponse(code = 422, message = 'Bad Entity Received'),
    ])
    @ApiImplicitParams([
        @ApiImplicitParam(name = 'body', paramType = 'body', required = true, dataType = 'GreetingRequest'),
    ])
    def save() {
        GreetingRequest greetingRequest = createResource()
        Greeting greeting = new Greeting(message:greetingRequest.message())
        greetingRegisterService.register(greeting)
        respond new GreetingResponse(id:greeting.id.value, message:greeting.hello())
    }
}
