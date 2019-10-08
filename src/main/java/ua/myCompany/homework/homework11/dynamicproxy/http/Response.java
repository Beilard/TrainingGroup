package ua.myCompany.homework.homework11.dynamicproxy.http;

public class Response {
    private final Status status;
    private final String body;

    public Response(Status status, Object body) {
        this.status = status;
        this.body = body.toString();
    }

    public Status getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{" +
                "status: " + status +
                ", body:" + body  + '}';
    }
}
