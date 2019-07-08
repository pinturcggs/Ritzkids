/*
 * package com.rcyc.ritzkids.controller;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.ResponseStatus;
 * 
 * import com.rcyc.ritzkids.ExceptionResponse; import
 * com.rcyc.ritzkids.RygNotFoundException;
 * 
 * @ControllerAdvice public class RygHandlerControllerAdvice {
 * 
 * @ExceptionHandler(RygNotFoundException.class)
 * 
 * @ResponseStatus(value = HttpStatus.NOT_FOUND) public @ResponseBody
 * ExceptionResponse handleEquipmentNotFound(final RygNotFoundException
 * exception, final HttpServletRequest request) {
 * 
 * ExceptionResponse error = new ExceptionResponse();
 * error.setErrorMessage(exception.getMessage());
 * error.callerURL(request.getRequestURI());
 * 
 * return error; }
 * 
 * }
 */