/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.cars.app.client.dealer.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import com.cars.app.client.dealer.model.DealerDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-24T13:39:32.772114376+07:00[Asia/Ho_Chi_Minh]")

@Validated
@Api(value = "DealerResource", description = "the DealerResource API")
public interface DealerResourceApi {

    /**
     * POST /api/dealers
     *
     * @param dealerDTO (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "createDealer", notes = "", response = DealerDTO.class, tags = {
            "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = DealerDTO.class) })
    @RequestMapping(value = "/api/dealers", produces = "*/*", consumes = "application/json", method = RequestMethod.POST)
    ResponseEntity<DealerDTO> createDealer(
            @ApiParam(value = "", required = true) @Valid @RequestBody DealerDTO dealerDTO);

    /**
     * DELETE /api/dealers/{id}
     *
     * @param id (required)
     * @return No Content (status code 204)
     */
    @ApiOperation(value = "", nickname = "deleteDealer", notes = "", tags = { "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "No Content") })
    @RequestMapping(value = "/api/dealers/{id}", method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDealer(@ApiParam(value = "", required = true) @PathVariable("id") Long id);

    /**
     * GET /api/dealers
     *
     * @param page Zero-based page index (0..N) (optional, default to 0)
     * @param size The size of the page to be returned (optional, default to 20)
     * @param sort Sorting criteria in the format: property(,asc|desc). Default sort
     *             order is ascending. Multiple sort criteria are supported.
     *             (optional, default to new ArrayList&lt;&gt;())
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "getAllDealers", notes = "", response = DealerDTO.class, responseContainer = "List", tags = {
            "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = DealerDTO.class, responseContainer = "List") })
    @RequestMapping(value = "/api/dealers", produces = "*/*", method = RequestMethod.GET)
    ResponseEntity<List<DealerDTO>> getAllDealers(
            @Min(0) @ApiParam(value = "Zero-based page index (0..N)", defaultValue = "0") @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @Min(1) @ApiParam(value = "The size of the page to be returned", defaultValue = "20") @Valid @RequestParam(value = "size", required = false, defaultValue = "20") Integer size,
            @ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);

    /**
     * GET /api/dealers/{id}
     *
     * @param id (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "getDealer", notes = "", response = DealerDTO.class, tags = {
            "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = DealerDTO.class) })
    @RequestMapping(value = "/api/dealers/{id}", produces = "*/*", method = RequestMethod.GET)
    ResponseEntity<DealerDTO> getDealer(@ApiParam(value = "", required = true) @PathVariable("id") Long id);

    /**
     * PATCH /api/dealers/{id}
     *
     * @param id        (required)
     * @param dealerDTO (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "partialUpdateDealer", notes = "", response = DealerDTO.class, tags = {
            "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = DealerDTO.class) })
    @RequestMapping(value = "/api/dealers/{id}", produces = "*/*", consumes = "application/json", method = RequestMethod.PATCH)
    ResponseEntity<DealerDTO> partialUpdateDealer(@ApiParam(value = "", required = true) @PathVariable("id") Long id,
            @ApiParam(value = "", required = true) @Valid @RequestBody DealerDTO dealerDTO);

    /**
     * PUT /api/dealers/{id}
     *
     * @param id        (required)
     * @param dealerDTO (required)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "", nickname = "updateDealer", notes = "", response = DealerDTO.class, tags = {
            "dealer-resource", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = DealerDTO.class) })
    @RequestMapping(value = "/api/dealers/{id}", produces = "*/*", consumes = "application/json", method = RequestMethod.PUT)
    ResponseEntity<DealerDTO> updateDealer(@ApiParam(value = "", required = true) @PathVariable("id") Long id,
            @ApiParam(value = "", required = true) @Valid @RequestBody DealerDTO dealerDTO);

}