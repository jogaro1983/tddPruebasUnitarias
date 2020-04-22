package tdd;

public class CacheControllerFactory {

	//private static CacheControllerFactory cacheControllerFactory;
	
	public static CacheControllerFactory getInstance() {
		/*if(cacheControllerFactory == null) {
			cacheControllerFactory = new CacheControllerFactory();
		}*/
		
		return new CacheControllerFactory();
	}
}
