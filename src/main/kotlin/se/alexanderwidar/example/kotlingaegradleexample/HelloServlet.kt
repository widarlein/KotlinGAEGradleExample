package se.alexanderwidar.example.kotlingaegradleexample

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by widar on 2016-09-28.
 */
class HelloServlet : HttpServlet() {

    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        val writer = resp.writer
        writer.println("Hello, Kotlin!")
    }
}