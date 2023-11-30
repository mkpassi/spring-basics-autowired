### __*@AUTOWIRED*__

@Autowired is a decorator that can be used to inject dependencies into a class. It is used to annotate a constructor, field, setter method, or config method to auto wire bean on the fly.

@Autowired Annotation is processed by __AutowiredAnnotationBeanPostProcessor__ which is a BeanPostProcessor implementation. 

Using this annotation enables automatic Spring Dependency resoultion that is primarily based on types.

@Autowired has a property required which is set to true by default. If the property is set to true and no matching bean is found, then an exception is thrown. If the property is set to false and no matching bean is found, then the property is not injected.

If @Autowired is used on top of Collection or Map, then Spring will inject all beans matching the type into the collection and key-value pairs into the map.

Order of elements depends on usage of @Order, @Priority and implementatdion of Ordered interface.


Selection Criteria for Beans Auto Wiring:

* Match by Type 
* If more than one bean of the same type is present, check for @Primary annotation.
* If no exact match is found, then check for @Qualifier annotation.
* If no exact match is found, then check for bean name.
* If no exact match is found, then check for @Autowired(required=false) annotation.
* If no exact match is found, then throw an exception, __*NoSuchBeanDefinitionException*__ or __*NoUniqueBeanDefinitionException*__.

### __*Field Injection*__

```java
import javax.annotation.processing.SupportedAnnotationTypes;

@Autowired
private Employee employee;
@Autowired
public Employee employee;
@Autowired
protected Employee employee;
@Autowired
Employee employee;
```
