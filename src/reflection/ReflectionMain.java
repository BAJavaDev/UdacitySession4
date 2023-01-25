package reflection;

import design.patterns.SearchService;

import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        SearchService serviceService = SearchService.getInstance();
        ProxyTime proxyTime = new ProxyTime();

        ISearchService proxiedSearch = proxyTime.wrapInProxy(ISearchService.class, serviceService);
        proxiedSearch.getCustomerByFirstName("brandon");
        proxiedSearch.getCustomerByLastName("Alleyne");

        // Get methods on service class
        Method[] methods = serviceService.getClass().getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }


    }
}
