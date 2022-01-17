Redis test code
========================

**Overview**: 

Configuration test for Redis.

**Running locally**

```sh
docker-compose.yml - file only pulls up mongo db 
```

Make sure to have redis server running locally which the application can connnetct to, in case it's not i yml:

```sh
redis-server

applicatio file setting:
cache:
  enabled: true
  ttl:
    seconds:
      books: 60
```

Setting TTL:

        configurationMap.put("book", RedisCacheConfiguration.defaultCacheConfig()
            .entryTtl(Duration.ofSeconds(bookTTL)));

TTL is 60 seconds as per current settings (so if you take more then a miunute to check value out it is probably evicted by then, 
in that case you can just increase the seconds or play around with giving the TTL in minutes or hours). 

ConfigurationMap key should be the key you are caching it with:

```sh
@Cacheable(value = "book")
public List<BookData> getBooksCached() {
```