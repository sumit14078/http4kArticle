val app = { request: Request -> Response(OK).body(request.body) } 
val server = app.asServer(SunHttp(8000)).start()
