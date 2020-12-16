package org.yangcis.parsing.exception;

import org.apache.servicecomb.swagger.invocation.Response;
import org.apache.servicecomb.swagger.invocation.SwaggerInvocation;
import org.apache.servicecomb.swagger.invocation.exception.ExceptionToProducerResponseConverter;
import org.apache.servicecomb.swagger.invocation.exception.InvocationException;
import org.yangcis.parsing.common.ResponseEnum;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response.Status;

/**
 * @author: yangyinqi1991@gmail.com
 * @date: 2020/12/16
 * @description: 自定义返回异常
 */
public class DefaultExceptionToProducerResponseConverter implements ExceptionToProducerResponseConverter <Throwable>{
    @Override
    public Class<Throwable> getExceptionClass() {
        return Throwable.class;
    }

    @Override public int getOrder() {
        return -100;
    }

    @Override
    public Response convert(SwaggerInvocation swaggerInvocation, Throwable e) {
        Response response;
        if (e instanceof ParsingException) {
            response = Response.createFail((ParsingException)e);
        } else if (e instanceof ConstraintViolationException) {
            response = Response.createFail(new InvocationException(Status.FORBIDDEN,
                    ResponseEnum.PARAMETER_ERROR.getCode(),
                    e.getMessage()));
        }else {
            response = Response.createFail(new InvocationException(Status.INTERNAL_SERVER_ERROR, e));
        }
        return response;
    }
}
