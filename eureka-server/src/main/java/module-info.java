/**
 * 
 */
/**
 * @author Ahn
 * 2021
 *
 */
module module_info {
	exports com.udacity.eureka;

	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.cloud.netflix.eureka.server;
	requires spring.context;
	requires spring.core;
}