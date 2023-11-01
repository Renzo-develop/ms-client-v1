package com.rec.msclient.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Interceptor;
import org.springframework.core.Ordered;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
//import okhttp3.Response;
import java.util.Optional;

@Slf4j
@NoArgsConstructor
public class ApiExceptionInterceptor implements Interceptor, Ordered {

    private static final ObjectMapper mapper = new ObjectMapper();

//    private Optional<String> getBodyFromResponse(Response response) {
//
//        return Optional
//                .ofNullable(response.body())
//                .flatMap(responseBody -> {
//                    Objects.requireNonNull(responseBody);
//                    return Try
//                            .of(responseBody::string)
//                            .toJavaOptional();
//                })
//                .filter(Predicate.not(String::isBlank));
//    }
//
//    private ErrorCategory resolve(int httpStatus) {
//        if (httpStatus == 500) {
//            return ErrorCategory.EXTERNAL_ERROR;
//        } else if (httpStatus == 503) {
//            return ErrorCategory.SERVICE_UNAVAILABLE;
//        } else if (httpStatus == 404) {
//            return ErrorCategory.RESOURCE_NOT_FOUND;
//        } else if (httpStatus == 400) {
//            return ErrorCategory.INVALID_REQUEST;
//        } else {
//            return Arrays
//                    .stream(ErrorCategory.values())
//                    .filter(errorCategory -> errorCategory.getHttpStatus() == httpStatus)
//                    .findFirst()
//                    .orElse(ErrorCategory.UNEXPECTED);
//        }
//    }

    @Override
    public int getOrder() {
        return 1;
    }
}
