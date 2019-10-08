package ua.myCompany.homework.homework11.dynamicproxy;

import ua.myCompany.homework.homework11.dynamicproxy.excpetion.EntityNotFoundException;
import ua.myCompany.homework.homework11.dynamicproxy.http.Response;
import ua.myCompany.homework.homework11.dynamicproxy.http.Status;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static ua.myCompany.homework.homework11.dynamicproxy.http.Status.*;

public class ExceptionHandler implements InvocationHandler {

    private Map<Class<? extends Exception>, Status> exceptionToStatus = new HashMap<>();

    public ExceptionHandler() {
        exceptionToStatus.put(EntityNotFoundException.class, NOT_FOUND);
        exceptionToStatus.put(NullPointerException.class, SERVER_ERROR);
    }

    @Override
    public Response invoke(Object proxy, Method method, Object[] args) {
        try {
            Object invoke = method.invoke(proxy, args);
            return new Response(OK, invoke.toString());
        } catch (Exception e) {
            Throwable reason = e.getCause();
            Class<? extends Throwable> clazz = reason.getClass();
            Status status = exceptionToStatus.get(clazz);
            return new Response(status, "");
        }
    }
}
