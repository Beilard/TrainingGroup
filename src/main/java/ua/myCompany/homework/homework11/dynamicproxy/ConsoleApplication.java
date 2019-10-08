package ua.myCompany.homework.homework11.dynamicproxy;

import ua.myCompany.homework.homework11.dynamicproxy.http.Response;
import ua.myCompany.homework.homework11.dynamicproxy.service.UserService;
import ua.myCompany.homework.homework11.dynamicproxy.service.UserServiceImpl;

import java.lang.reflect.Method;

public class ConsoleApplication {
    public static void main(String[] args) throws Throwable {

        ExceptionHandler exceptionHandler = new ExceptionHandler();

        UserService userService = new UserServiceImpl();
        Class<? extends UserService> clazz = userService.getClass();
        Method method = clazz.getMethod("findById", Long.class);

        Response response = exceptionHandler.invoke(userService, method, new Object[]{1L});
        Response responseNotFoundTheUser = exceptionHandler.invoke(userService, method, new Object[]{2L});
        Response responseWithNull = exceptionHandler.invoke(userService, method, new Object[]{null});
        System.out.println(response);

    }
}
