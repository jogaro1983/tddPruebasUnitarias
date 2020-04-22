package tdd;

public class UrlShorterner{
	
	CacheController cacheController;
	
	public String shorter(String url) {
		return this.cacheController.shortUrl(url);
	}

	public String reverseUrl(String shortenUrl) {
		return this.cacheController.reverseUrl(shortenUrl);
	}

}
