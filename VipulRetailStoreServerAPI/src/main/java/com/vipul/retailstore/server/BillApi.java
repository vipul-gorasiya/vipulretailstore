/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.vipul.retailstore.server;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vipul.retailstore.server.model.Bill;
import com.vipul.retailstore.server.service.StoreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-13T10:52:16.203+05:30")

@Api(value = "bill", description = "the bill API")
public interface BillApi {

	Logger log = LoggerFactory.getLogger(BillApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
		return Optional.empty();
	}

	default Optional<HttpServletRequest> getRequest() {
		return Optional.empty();
	}

	default Optional<String> getAcceptHeader() {
		return getRequest().map(r -> r.getHeader("Accept"));
	}

	default Optional<StoreService> getService() {
		return Optional.empty();
	}

	@ApiOperation(value = "add product to bill", nickname = "addproduct", notes = "", response = Bill.class, tags = {
			"bill", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Bill.class),
			@ApiResponse(code = 400, message = "Invalid Bill") })
	@RequestMapping(value = "/bill/{productId}", produces = { "application/json" }, method = RequestMethod.PUT)
	default ResponseEntity<Bill> addproduct(
			@ApiParam(value = "product to be added", required = true) @PathVariable("productId") String productId,
			@ApiParam(value = "Bill to be modified", required = true) @Valid @RequestBody Bill body) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getService().isPresent()) {
				return new ResponseEntity<>(getService().get().addProductToBill(body, Long.valueOf(productId)),
						HttpStatus.OK);
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default BillApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@ApiOperation(value = "complete bill", nickname = "completeBill", notes = "", response = Bill.class, tags = {
			"bill", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Bill.class),
			@ApiResponse(code = 400, message = "Invalid Bill") })
	@RequestMapping(value = "/bill", produces = { "application/xml", "application/json" }, method = RequestMethod.PUT)
	default ResponseEntity<Bill> completeBill(
			@ApiParam(value = "Bill to be saved", required = true) @Valid @RequestBody Bill body) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getService().isPresent()) {
				return new ResponseEntity<>(getService().get().completeBill(body), HttpStatus.OK);
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default BillApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@ApiOperation(value = "Create Bill", nickname = "createBill", notes = "", response = Bill.class, tags = {
			"bill", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation", response = Bill.class),
			@ApiResponse(code = 400, message = "Invalid Bill") })
	@RequestMapping(value = "/bill", produces = { "application/xml", "application/json" }, method = RequestMethod.POST)
	default ResponseEntity<Bill> createBill() {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getService().isPresent()) {
				return new ResponseEntity<>(getService().get().createBill(), HttpStatus.OK);
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default BillApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@ApiOperation(value = "Deletes a bill item", nickname = "delete", notes = "", tags = { "bill", })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
			@ApiResponse(code = 404, message = "product id not found") })
	@RequestMapping(value = "/bill/{productId}", produces = { "application/json" }, method = RequestMethod.DELETE)
	default ResponseEntity<Bill> delete(
			@ApiParam(value = "product which needs to be deleted", required = true) @PathVariable("productId") String productId,
			@ApiParam(value = "Bill to be modified", required = true) @Valid @RequestBody Bill body) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getService().isPresent()) {
				return new ResponseEntity<>(getService().get().removeProductFromBill(body, Long.valueOf(productId)),
						HttpStatus.OK);
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default BillApi interface so no example is generated");
		}
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

}
