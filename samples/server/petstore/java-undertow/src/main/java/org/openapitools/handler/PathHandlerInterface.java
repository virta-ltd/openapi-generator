/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI document version: 1.0.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Add a new pet to the store</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/pet" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}, {isXml=true, mediaType=application/xml}]</p>
     * <p><b>Payload</b>: {@link Pet} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>405 (client error)</b>: Invalid input</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler addPet();

    /**
     * <p>Deletes a pet</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v2/pet/{petId}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>petId</b>"
     * <p>Pet id to delete</p>
     * <p>
     * - Parameter type: <b>{@link Long}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>api_key</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link Headers Header}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>400 (client error)</b>: Invalid pet value</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deletePet();

    /**
     * <p>Finds Pets by status</p>
     *
     * <p>Multiple status values can be provided with comma separated strings</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/pet/findByStatus" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>status</b>"
     * <p>Status values that need to be considered for filter</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Pet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid status value</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler findPetsByStatus();

    /**
     * <p>Finds Pets by tags</p>
     *
     * <p>Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/pet/findByTags" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>tags</b>"
     * <p>Tags to filter by</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Pet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid tag value</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    @Deprecated
    HttpHandler findPetsByTags();

    /**
     * <p>Find pet by ID</p>
     *
     * <p>Returns a single pet</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/pet/{petId}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>petId</b>"
     * <p>ID of pet to return</p>
     * <p>
     * - Parameter type: <b>{@link Long}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid ID supplied</li>
     * <li><b>404 (client error)</b>: Pet not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getPetById();

    /**
     * <p>Update an existing pet</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PUT PUT} "/v2/pet" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}, {isXml=true, mediaType=application/xml}]</p>
     * <p><b>Payload</b>: {@link Pet} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid ID supplied</li>
     * <li><b>404 (client error)</b>: Pet not found</li>
     * <li><b>405 (client error)</b>: Validation exception</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updatePet();

    /**
     * <p>Updates a pet in the store with form data</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/pet/{petId}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>petId</b>"
     * <p>ID of pet that needs to be updated</p>
     * <p>
     * - Parameter type: <b>{@link Long}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>name</b>"
     * <p>Updated name of the pet</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>status</b>"
     * <p>Updated status of the pet</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/x-www-form-urlencoded}]</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>405 (client error)</b>: Invalid input</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updatePetWithForm();

    /**
     * <p>uploads an image</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/pet/{petId}/uploadImage" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>petId</b>"
     * <p>ID of pet to update</p>
     * <p>
     * - Parameter type: <b>{@link Long}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>additionalMetadata</b>"
     * <p>Additional data to pass to server</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>file</b>"
     * <p>file to upload</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ModelApiResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler uploadFile();

    /**
     * <p>Delete purchase order by ID</p>
     *
     * <p>For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v2/store/order/{orderId}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>orderId</b>"
     * <p>ID of the order that needs to be deleted</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>400 (client error)</b>: Invalid ID supplied</li>
     * <li><b>404 (client error)</b>: Order not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteOrder();

    /**
     * <p>Returns pet inventories by status</p>
     *
     * <p>Returns a map of status codes to quantities</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/store/inventory" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link Integer}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getInventory();

    /**
     * <p>Find purchase order by ID</p>
     *
     * <p>For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/store/order/{orderId}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>orderId</b>"
     * <p>ID of pet that needs to be fetched</p>
     * <p>
     * - Parameter type: <b>{@link Long}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Order}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid ID supplied</li>
     * <li><b>404 (client error)</b>: Order not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getOrderById();

    /**
     * <p>Place an order for a pet</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/store/order" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link Order} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Order}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid Order</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler placeOrder();

    /**
     * <p>Create user</p>
     *
     * <p>This can only be done by the logged in user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/user" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link User} (<i>required: true</i>)</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>Default</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUser();

    /**
     * <p>Creates list of users with given input array</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/user/createWithArray" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link User} (<i>required: true</i>)</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>Default</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUsersWithArrayInput();

    /**
     * <p>Creates list of users with given input array</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v2/user/createWithList" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link User} (<i>required: true</i>)</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>Default</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createUsersWithListInput();

    /**
     * <p>Delete user</p>
     *
     * <p>This can only be done by the logged in user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v2/user/{username}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>The name that needs to be deleted</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>400 (client error)</b>: Invalid username supplied</li>
     * <li><b>404 (client error)</b>: User not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteUser();

    /**
     * <p>Get user by user name</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/user/{username}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>The name that needs to be fetched. Use user1 for testing.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link User}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid username supplied</li>
     * <li><b>404 (client error)</b>: User not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getUserByName();

    /**
     * <p>Logs user into the system</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/user/login" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>The user name for login</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>password</b>"
     * <p>The password for login in clear text</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     * <p><b>Response headers</b>: [CodegenProperty{openApiType='string', baseName='Set-Cookie', complexType='null', getter='getSetCookie', setter='setSetCookie', description='Cookie authentication key for use with the `api_key` apiKey authentication.', dataType='String', datatypeWithEnum='String', dataFormat='null', name='setCookie', min='null', max='null', defaultValue='null', defaultValueWithParam=' = data.Set-Cookie;', baseType='String', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='Cookie authentication key for use with the `api_key` apiKey authentication.', maxLength=null, minLength=null, pattern='null', example='AUTH_KEY=abcde12345; Path=/; HttpOnly', jsonSchema='{
  "example" : "AUTH_KEY=abcde12345; Path=/; HttpOnly",
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=true, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isOptional=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='setCookie', nameInPascalCase='SetCookie', nameInSnakeCase='SET_COOKIE', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, hasSanitizedName=true, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=null, dependentRequired=null, contains=null}, CodegenProperty{openApiType='integer', baseName='X-Rate-Limit', complexType='null', getter='getxRateLimit', setter='setxRateLimit', description='calls per hour allowed by the user', dataType='Integer', datatypeWithEnum='Integer', dataFormat='int32', name='xRateLimit', min='null', max='null', defaultValue='null', defaultValueWithParam=' = data.X-Rate-Limit;', baseType='Integer', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='calls per hour allowed by the user', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "format" : "int32",
  "type" : "integer"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, isPrimitiveType=true, isModel=false, isContainer=false, isString=false, isNumeric=true, isInteger=true, isShort=true, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=false, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isOptional=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='xRateLimit', nameInPascalCase='XRateLimit', nameInSnakeCase='X_RATE_LIMIT', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, hasSanitizedName=true, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=int32, dependentRequired=null, contains=null}, CodegenProperty{openApiType='string', baseName='X-Expires-After', complexType='Date', getter='getxExpiresAfter', setter='setxExpiresAfter', description='date in UTC when token expires', dataType='Date', datatypeWithEnum='Date', dataFormat='date-time', name='xExpiresAfter', min='null', max='null', defaultValue='null', defaultValueWithParam=' = data.X-Expires-After;', baseType='Date', containerType='null', containerTypeMapped='null', title='null', unescapedDescription='date in UTC when token expires', maxLength=null, minLength=null, pattern='null', example='null', jsonSchema='{
  "format" : "date-time",
  "type" : "string"
}', minimum='null', maximum='null', exclusiveMinimum=false, exclusiveMaximum=false, required=false, deprecated=false, isPrimitiveType=false, isModel=false, isContainer=false, isString=false, isNumeric=false, isInteger=false, isShort=false, isLong=false, isUnboundedInteger=false, isNumber=false, isFloat=false, isDouble=false, isDecimal=false, isByteArray=false, isBinary=false, isFile=false, isBoolean=false, isDate=false, isDateTime=true, isUuid=false, isUri=false, isEmail=false, isPassword=false, isFreeFormObject=false, isArray=false, isMap=false, isOptional=false, isEnum=false, isInnerEnum=false, isEnumRef=false, isAnyType=false, isReadOnly=false, isWriteOnly=false, isNullable=false, isSelfReference=false, isCircularReference=false, isDiscriminator=false, isNew=false, isOverridden=null, _enum=null, allowableValues=null, items=null, additionalProperties=null, vars=[], requiredVars=[], mostInnerItems=null, vendorExtensions={}, hasValidation=false, isInherited=false, discriminatorValue='null', nameInCamelCase='xExpiresAfter', nameInPascalCase='XExpiresAfter', nameInSnakeCase='X_EXPIRES_AFTER', enumName='null', maxItems=null, minItems=null, maxProperties=null, minProperties=null, uniqueItems=false, uniqueItemsBoolean=null, multipleOf=null, isXmlAttribute=false, xmlPrefix='null', xmlName='null', xmlNamespace='null', isXmlWrapped=false, isNull=false, isVoid=false, getAdditionalPropertiesIsAnyType=false, getHasVars=false, getHasRequired=false, getHasDiscriminatorWithNonEmptyMapping=false, composedSchemas=null, hasMultipleTypes=false, hasSanitizedName=true, requiredVarsMap=null, ref=null, schemaIsFromAdditionalProperties=false, isBooleanSchemaTrue=false, isBooleanSchemaFalse=false, format=date-time, dependentRequired=null, contains=null}]</p>
     *
     * <p><b>Produces</b>: [{isXml=true, mediaType=application/xml}, {isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: successful operation</li>
     * <li><b>400 (client error)</b>: Invalid username/password supplied</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler loginUser();

    /**
     * <p>Logs out current logged in user session</p>
     *
     * <p></p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v2/user/logout" (<i>privileged: true</i>)</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>Default</b>: successful operation</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler logoutUser();

    /**
     * <p>Updated user</p>
     *
     * <p>This can only be done by the logged in user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PUT PUT} "/v2/user/{username}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>name that need to be deleted</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link User} (<i>required: true</i>)</p>
     *
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>400 (client error)</b>: Invalid user supplied</li>
     * <li><b>404 (client error)</b>: User not found</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateUser();
}
