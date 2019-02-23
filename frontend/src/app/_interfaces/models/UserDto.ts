/**
 * [app.name not defined in app.properties]
 * Admin API
 *
 * OpenAPI spec version: 0.0.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { BaseUserRole } from './BaseUserRole';


export interface UserDto {
	avatarUrl?: string;
	email?: string;
	id?: number;
	role?: BaseUserRole;
	uploaded?: boolean;
	username?: string;
}
